package com.github.vlsidlyarevich.effectivejava.followup.object_creation.twr;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 11/13/21.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Old way
        InputStream oldWayStream = new FileInputStream("main.java");
        try {
            OutputStream oldWayOutputStream = new FileOutputStream("main1.java");
            try {
                // some stuff
                oldWayOutputStream.write(oldWayStream.readAllBytes());

            } finally {
                oldWayOutputStream.close();
            }
        } finally {
            oldWayStream.close();
        }


        // New way
        try (var input = new FileInputStream("main.java");
             var output = new FileOutputStream("main1.java")) {

            output.write(input.readAllBytes());
        }
    }
}

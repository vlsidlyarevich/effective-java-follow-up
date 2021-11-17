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
        var path = Main.class.getResource("README.MD");

        // Old way
        InputStream oldWayStream = new FileInputStream(path.getFile());
        try {
            OutputStream oldWayOutputStream = new FileOutputStream("NEW_README.MD");
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
        try (var input = new FileInputStream(path.getFile());
             var output = new FileOutputStream("NEW_README_2.MD")) {

            output.write(input.readAllBytes());
        }
    }
}

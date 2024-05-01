package org.example.tree;

import jdk.internal.icu.text.UnicodeSet;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
        String partOfName;
        String partOfContent;

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            boolean containsName = true;
            if(partOfName!=null && !file.getFileName().toString().contains(partOfName))
                containsName = false;

            String content = new String(Files.readAllBytes(file));
            boolean containsContent = true;
            if(partOfContent!=null && !content.contains(partOfContent))
                containsContent = false;

            UnicodeSet foundFiles = null;
            if(containsName && containsContent) {
               foundFiles.add((CharSequence) file);
            }

            return FileVisitResult.CONTINUE;

        }
}


package org.example.tree;

import java.nio.file.Files;

/*
2 Files обладает способом обхода дерева каталогов. Более подробно можно об этом
почитать в статье https://habr.com/ru/articles/437694/.
Создайте программу, которая будет принимать путь к существующей папке на Вашем
компьютере. После этого программа должна вывести имена файлов и папок на каждом
уровне, начиная с текущей папки до корня дерева (диска C или другого диска).
 */
public class Tree {
    public static void main(String[] args) {

      //  Files.walkFileTree(Path start, FileVisitor<? super Path> visitor);
    //    Files.walkFileTree(Path start, Set<FileVisitOption> options, int maxDepth, FileVisitor<? super Path> visitor);
        MyFileVisitor myFileVisitor = new MyFileVisitor();
   //     myFileVisitor.visitFile("employee","???");
    }
}

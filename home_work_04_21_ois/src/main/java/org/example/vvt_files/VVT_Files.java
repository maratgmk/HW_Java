package org.example.vvt_files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
1 Есть архив VttFiles.zip с набором vtt-файлов (субтитры к аудио-дорожкам). Из субтитров
нужно собрать единый файл txt для последующего создания документа со скриптами
аудио-дорожек. В txt поместите только тексты из субтитров. Все лишние записи (время,
WEBVTT) должны быть удалены.
 */
public class VVT_Files {
    public static void main(String[] args) throws IOException {
        String[] addresses = {"VttFiles/Empower Intermediate Class Audio Track 00-01.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-01.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-02.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-03.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-04.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-05.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-06.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-07.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-08.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-09.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-10.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-11.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-12.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-13.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-14.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-15.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-16.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-17.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-18.vtt",
                "VttFiles/Empower Intermediate Class Audio Track 01-19.vtt"};
        List<String> superLine = new ArrayList<>();

        for (String address : addresses) {
            Scanner scanner = new Scanner(Path.of(address));
            List<String> lines = new ArrayList<>();

            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            lines.removeFirst();
            lines.removeFirst();
            for (int i = lines.size() - 2; i >= 0; i = i - 3) {
                lines.remove(i);
            }
            for (int i = lines.size() - 2; i >= 0; i = i - 2) {
                lines.remove(i);
            }
            superLine.addAll(lines);
            System.out.println(lines);
        }
        System.out.println(superLine);

      //  write(superLine,System.out);
        try ( OutputStream out = new FileOutputStream("vvt_lines")){
            write(superLine,out);
        }


    }
    private static void write(List<String> words, OutputStream out) throws IOException {
        for (String word : words) {
            out.write(word.getBytes(StandardCharsets.UTF_8));
            out.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));

        }
    }
}

package org.example;
/*
3 Создайте иерархию учебных предметов (Subject -> Natural sciences/exact
sciences/humanities -> Biology, Chemistry / Physics, Mathematics / Literature, Philology).
Напишите класс Student, параметризируемый предметом. Создайте классы студентов по
каждому из направлений (Natural sciences/exact sciences/humanities), укажите в
наследуемом параметре конкретный тип направления.
 */
import org.example.Main;
import org.example.subject.*;

import java.util.List;

public class CreateKlass {
    public static void main(String[] args) {
        Humanities humanities = new Humanities();
        Philology philology = new Philology();
        Literature literature = new Literature();

        Natural_Science naturalScience = new Natural_Science();
        Biology biology = new Biology();
        Chemistry chemistry = new Chemistry();

        Exact_Sciense exactSciense = new Exact_Sciense();
        Physics physics = new Physics();
        Mathematics mathematics = new Mathematics();


        Student<Humanities> student1 = new Student<>(literature,1);
        Student<Humanities> student2 = new Student<>(philology,1);
        Student<Philology> student3 = new Student<>(philology,1);
        Student<Mathematics> student4 = new Student<>(mathematics,4);
        Student<Subject> student5 = new Student<>(mathematics,4);
        Student<Exact_Sciense> student6 = new Student<>(mathematics,4);
        Student<Biology> student7 = new Student<>(biology,12);
        Student<Subject> student8 = new Student<>(biology,12);
        Student<Natural_Science> student9 = new Student<>(biology,12);
        Student<Natural_Science> student10 = new Student<>(chemistry,15);




        Klass<Exact_Sciense> klass1 = new Klass<>( List.of(new Student<>(physics, 2),new Student<>(physics,5),new Student<>(mathematics,8),student6));
        System.out.println(klass1);
        Klass<Humanities> klass2 = new Klass<>(List.of(student2,student1,new Student<>(literature,9),new Student<>(literature,10)));
        System.out.println(klass2);
        Klass<Natural_Science> klass3 = new Klass<>(List.of(student9,new Student<>(chemistry,13),new Student<>(biology,14),student10));
        System.out.println(klass3);
        //TODO проявлена инвариантность классов относительно операции наследования?


    }
}

package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur
        //new keyword u sifirdan yeni bir obje olusurturmak icin kullanilir.
        //Constructor Java'da objeleri olusturmak icin kullanilan özel bir methodtur. Her zaman class ismi olmalidir.
        //Class ismi + Object ismi + Assignment Operator + "new" keyword + Constructor

        Car myCar = new Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);

        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();

        myCar.dur();

        System.out.println("----------");

        Student myStudent = new Student();

        System.out.println("myStudent.name = " + myStudent.name);

        System.out.println("myStudent.adress = " + myStudent.adress);

        System.out.println("myStudent.grade = " + myStudent.grade);

        myStudent.study();

        myStudent.feed();

        System.out.println("----------");

        /*
        Homework
        Icinde isim ve yas variable olan teach method u bulunan bir Teacher object olusturun ve obje uzerinde bu özellikleri kullanin
         */

        TeacherHomework myTeacher = new TeacherHomework();

        System.out.println("myTeacher.name = " + myTeacher.name);

        System.out.println("myTeacher.age = " + myTeacher.age);

        myTeacher.teach();

    }

}

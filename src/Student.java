public class Student {

String name = "Elizabeth Phakane";
String courseName = "Software Development";
int age = 22;
double rent = 2000;
double food = 1000;
double toiletries = 50;
boolean hasRes = false;
  char courseCode = 'S';

String ageStatus ;

public Student (){
    System.out.println("The following are Students' monthly finances:");
}

public Student (String newName, String newCourseName, boolean newHasRes,char newCourseCode,int newAge,int newRent) {
    name = newName;
    courseName = newCourseName;
    hasRes = newHasRes;
    courseCode= newCourseCode;
    age = newAge;
    rent = newRent;
}

// gives rent advice based on current rent value
public void rentAdvice(){
    if(!hasRes && rent > 1500){
         System.out.println ("Please opt for Campus residency, it is less expensive");
    }
    else{

       System.out.println("Good financial move");
    }

}

//determines the age status using age
public String getAgeStatus() {
    if (age < 18 ){
        ageStatus = "Minor";
    } else if (age >= 18 &&  age <26) {
        ageStatus = "Young Adult";
    }
   else {
       ageStatus="Adult";
    }
    return ageStatus;  
}


//gives discount of 15% to a person with course code S and 10% to a person with course code A
public void discount (){
    if ((rent + food) >= 3500 && courseCode =='S' ){
        food = food-(food * 0.15);
        System.out.println("Congrats! You just got a discount of 15% on your groceries");
    }
    else if((rent + food) >= 3500 && courseCode =='A' ) {
        food = food -(food * 0.1);
        System.out.println("Congrats! You just got a discount of 10% on your groceries");
    }
    else{
        System.out.println("Sorry you don't qualify for discount");
    }

}

//changes the initial names
public void changeName() {
    if (name == "Elizabeth Phakane") {
        name = "Amahle Nkosi";
    }
    else if (name == "Sam Ngele"){
        name = "Jacob Bridgerton";
    }
}

//while loop showing alcohol restriction message determined by age value
    public void alcoholRestrictions (){

        while (age < 18){
            System.out.println("Not for sales under the age of 18.");
            age++;
        }

    }

    // do while loop
    public void showRentMessage(){

    do {
        System.out.println("Your rent is affordable");
    }while(rent<1500);

    }

    //for loop to show a message

    public void forLoopMessage(){

    for(int k=0; k<5 ;k++){

        System.out.println("This class has 10 methods");

        }
    }


    //for loop to show the value of k each time when the loop executes
    public void forLoopValue(){

        for(int k=0; k<5 ;k++){

            System.out.println("The value of k is: " + k);

        }
    }

// an array to store the students names
    public void displayNames(){

    String[] names = new String[2];

    // assigning each index a string
        names[0]= "Amahle Nkosi";
        names[1]= "Sam Ngele";

        // printing out each name through a for loop

        for (int k=0; k<names.length;k++)
        {
            System.out.println("The value at index "+k+" is "+ names[k]);
        }

    }


    // Switch case to show what each courseCode stands for
    public  void switchStatements (){

    switch(courseCode){

        case 'S':
            System.out.println("Software Development");
            break;
        case 'A':
            System.out.println("Accounting");
            break;
        case 'E':
            System.out.println("Engineering");
            break;
        case 'L':
            System.out.println("Law");
            break;
    }


    }



    public void display(){
    System.out.println(name);
    System.out.println(courseName);
    System.out.println(age);
    System.out.println(rent);
    System.out.println(food);
    System.out.println(toiletries);
    System.out.println(hasRes);
    System.out.println(courseCode);

}






    public static void main(String[] args) {
        Student s1 = new Student ();
        Student s2 = new Student("Sam Ngele","Accounting",true,'A',16,1500);

        System.out.println("Student 1");

        s1.display();
        s1.changeName();
        s1.getAgeStatus();
        s1.rentAdvice();
        s1.showRentMessage();
        s1.discount();
        s1.alcoholRestrictions();
        s1.forLoopMessage();
        s1.forLoopValue();
        s1.displayNames();
        s1.switchStatements();




        System.out.println("Student 2");

        s2.display();
        s2.changeName();
        s2.getAgeStatus();
        s2.rentAdvice();
        s2.showRentMessage();
        s2.discount();
        s2.alcoholRestrictions();
        s2.forLoopMessage();
        s2.forLoopValue();
        s2.displayNames();
        s2.switchStatements();



    }
}
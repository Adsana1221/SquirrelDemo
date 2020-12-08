package oop.lessonPractice;


public class Squirrel{

   // instance variable

 String colour;
 int age;
 int weight; 
 String foodstorage;

public Squirrel(String newColour, int newAge, int newWeight, String newFoodstorage){

  this.colour = newColour;
  this.age = newAge;
  this.weight = newWeight;
  this.foodstorage = newFoodstorage; 

}

public void jump(String strJump){
    System.out.println("Jumping; " + strJump);
  }


public void buryFood(String strburyFood){
    System.out.println("Burying Food;" + strburyFood)
  }

public void makeNoise(String strmakeNoise){
    System.out.println("Making Noise;" + strmakeNoise);
  
}


}












}
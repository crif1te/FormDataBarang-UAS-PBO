/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo;

/**
 *
 * @author Aspire Ryzen
 */
public class Uas_pbo {

    /**
     * @param args the command line arguments
     */
    
    public interface LivingThing{
        public void walk();
        public void eat();
    }
    
    public static void main(String[] args) {
        
        }
        abstract class Animal {
        public abstract void checkup();
        public abstract void breath();
    }
    class Dog extends Animal {
        public void checkup() {
            System.out.println("Dog checkup");
        }

        @Override
        public void breath() {
            System.out.println("Dog breath");
        }
    }
    class Cat extends Animal implements LivingThing{
        public void checkup(){
            System.out.println("Cat checkup");
        }

        @Override
        public void breath() {
            System.out.println("Cat breath");            
        }

        @Override
        public void walk() {
            System.out.println("Cat walk");    
        }

        @Override
        public void eat() {
            System.out.println("Cat eat");
        }
    }
    
    class Bird extends Animal{
        public void breath(){
            System.out.println("Bird breathing.");
        }

        @Override
        public void checkup() {
            System.out.println("Bird checkup");
        }
    }
    
    
    public class Human implements LivingThing
    { 
        public void breath(){
            System.out.println("Human breathing.");
        }

        @Override
        public void walk() {
            System.out.println("Human walk");
        }

        @Override
        public void eat() {
            System.out.println("Human eat");
        }
    }
}

    

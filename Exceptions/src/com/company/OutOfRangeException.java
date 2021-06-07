package com.company;

public class OutOfRangeException extends Exception {
        @Override

        public String getMessage(){

            return "Your input is out of range. Please try again!";

        }
}

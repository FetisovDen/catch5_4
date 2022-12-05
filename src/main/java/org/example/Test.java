package org.example;


public class Test {
    public void test(int i){
        try{
            if(i<0){
                throw new IllegalAccessException();
            }
            if (i>0){
                throw new RuntimeException();
            }
        }
        catch (IllegalAccessException | RuntimeException r){
            System.out.println("Тест работает");
        }

    }

}

//           Задача:
//        Напишите пример обработки нескольких исключений в одном блоке catch.
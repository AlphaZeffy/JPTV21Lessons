
package jptv21lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class JPTV21Lesson2 {

    public static void main(String[] args) {
        System.out.print("------------------------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite gradusi v tseljsijax: ");
        double celsius = scanner.nextDouble();
        double farenheit = (celsius * 9 / 5)  + 32;
        System.out.printf("gradusi v farengeitax = " + "%.2f", + farenheit);
        System.out.print("\n------------------------\n");
        
        
        System.out.println("vvedite 4islo: ");
        int x = new Scanner(System.in).nextInt();
        int summ = 0;
        System.out.println("edinits: " + x % 10);
        System.out.println("desjatkov: " + x / 10 % 10);
        System.out.println("soten: " + x / 100);
        while (x > 0) {
            summ += x % 10;
            x /= 10;
        }
        System.out.println("summa tsifr: " + summ);
        System.out.print("------------------------\n");
        
        
        int number;
        String result ="";
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write Year ");
        number = scanner1.nextInt();
        int animal = number%12;
        int color = number%10;
        switch (color){
            case 0: result = "belij ";
                     break;
            case 1: result = "belij ";
                     break;  
            case 2: result = "4ernij ";
                     break;  
            case 3: result = "4ernij ";
                     break;  
            case 4: result = "sinij ";
                     break;  
            case 5: result = "sinij ";
                     break;  
            case 6: result = "krasnij ";
                     break; 
            case 7: result = "krasnij";
                     break;  
            case 8: result = "weltij ";
                     break;  
            case 9: result = "weltij ";
                     break;           
        }
        switch (animal){
            case 0 : result += "obezjana ";
                     break;
            case 1: result += "petux ";
                     break;  
            case 2: result += "sobaka ";
                     break;  
            case 3: result += "svinja ";
                     break;  
            case 4: result += "krisa ";
                     break;  
            case 5: result += "bik ";
                     break;  
            case 6: result += "tigr ";
                     break; 
            case 7: result += "krolik ";
                     break;  
            case 8: result += "drakon ";
                     break;  
            case 9: result += "zmeja ";
                     break;
            case 10: result += "lowadj ";
                     break; 
            case 11: result += "ovtsa ";
                     break; 
             
                
        }
            System.out.println(result);
        System.out.print("------------------------\n");
 
        Random random = new Random();
        int i = 0;
        int counter = 0;
        while (i < 5){ 
            int Random1 = random.nextInt(11);
            int Random2 = random.nextInt(11);
            System.out.print(Random1 + " * " + Random2 + "= "); 
            Scanner scanner2 = new Scanner(System.in);
            number = scanner2.nextInt();
            if(number == Random1 * Random2){
                System.out.println((char) 27 + "[32mPraviljno! " + (char)27 + "[0m");     
                counter += 1;
                System.out.println(counter);   
            }else{
                System.out.println((char) 27 + "[31mNe praviljno! Verniij otvet  "+ Random1 * Random2 + (char)27 + "[0m");
            }
            i ++;
        }
        if(counter == 5)
            System.out.println("molodets! ");
        if(counter == 4)
            System.out.println("nu takoe, nado pou4itj");
        if(counter == 3)
            System.out.println("nu takoe, nado pou4itj");    
        if(counter <= 2)
        System.out.println("ploxo peredelivaj");
        
        System.out.print("------------------------\n");
        
        
        
        System.out.print("------------------------\n");
        
        
        
   
        Random random3 = new Random();
        System.out.println("---odnomerniy massiv---");
        int[] nums = new int[20];
        int sum=0;
        int min=0;
        int max=0;



        for(int  a= 0; a < nums.length;a++){
            nums[a]=random3.nextInt(10);
        }
            for(int a=0; a <nums.length;a++){
            System.out.printf("%3d",nums[a]*2) ;
            sum+=nums[a];
            if (min> nums[a]) min= nums[a];
            if (max< nums[a]) max= nums[a];



        }
        System.out.println();
        System.out.println("sum= "+sum*2);
        System.out.println("min= "+min*2);
        System.out.println("max= "+max*2);
        int avg=(sum-min-max)*2/18;
        System.out.println("avg="+ avg);
        
   
        

    }

}



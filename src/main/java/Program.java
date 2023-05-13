public class Program {
    public static void main(String[] args) {
        //1.Ввести 3 числа с клавиатуры x, y, z
        double x = 9;
        double y = 9;
        double z = 8;
        //2.Найти и вывести в консоль среднее арифметическое этих чисел
        double average = (x+y+z)/3;
        System.out.println(average);
        //3.Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double halfAverage = Math.floor(average/2);
        System.out.println(halfAverage);
        //4.Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if(halfAverage >3){
            System.out.println("Программа выполнена корректно");
        }
    }
}

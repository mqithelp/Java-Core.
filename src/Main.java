import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lyapis","Trubetskoy");
        System.out.println(person);
        person.changePerson(person);
        System.out.println(person);
    }
}

/*
Ответ на задание 5:
В терминал будет выведено число 33. Т.к. при вызове метода changeValue(value) значение переменной скопируется
в переменную value метода changeValue(33). Внутри метода changeValue переменная value принадлежит методу и никак
не связана с переменной в методе main. Она также располагается в стэке, но по другому адресу. После того как метод changeValue
закончит свою работу переменная value удалится из памяти. А переменная value в методе main будет жить до конца работы метода.

Ответ на задание 6:
В терминал также будет выведено число 33.
Разница в том, что Integer является классом, а значит в метод будет
передаваться ссылка, точнее копия ссылки, на значение. Но когда мы внутри метода changeValue делаем оперцию присваивания,
мы фактически создаём новую ссылку со значением 22. Я думаю происходит, что то типа этого --  value = new Integer(22);
Отличия 6 задания от 5-го практически нет. Можно и так и так :-)

Ответ на задание 7:
Вывод в терминал будет [3,4]. В методе changeValue выполним команду value = new Integer [1,2] -- переменной value
присвоится новая ссылка и данные будут записаны по новому адресу. И при завершении метода эта ссылка и данные
будут уничтожены/освобождены/удалены. Основная ж переменная value останется неизменной.

Ответ на задание 8:
Вывод в терминал будет [99, 4]. Массив хранится в куче, ссылка в стэке. В метод передаётся копия сслыки на массив.
Переменная в методе changeValue будет иметь такой адресс/ссылку как и главная переменная. Поэтому когды мы меняем
значения value[0]=99 -- мы меняем основной массив, перезаписывая значения массива.
В задании 7 в метод передалась копия ссылки главной переменной, но мы командой присваивания изменили копию на новую ссылку.
А в задании 8 мы менял значение которое находтся по копии главной ссылки и т.к. адрес одинаковый, то измение массива
в методе changeValue отразилось массив в главном методе.

Ответ задание 9:
Выод в терминал будет Lyapis Trubetskoy. Мы в метод передали копию ссылки на экземпляр класса Person.
Но внутри метода командой person = new Person("Ilya", "Lagutenko"); мы создали новый объект с новой ссылкой.
Переменная в главном методе останется без измений.

Ответ задание 10:
Выод в терминал будет Ilya Lagutenko. Так мы передаём в метод копию ссылки на объект, а потом по этой ссылке
меняем значения полей  person.name = "Ilya" и person.surname = "Lagutenko"; то изменятся значения и в главном методе.
Ссылку новую мы не создаём и не изменяем её.

 */


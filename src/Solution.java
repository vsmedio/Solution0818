import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put("name" + i, i + 495);
        }

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Integer> iter = map.values().iterator();

        while (iter.hasNext()) {
            if (iter.next() < 500) {
                iter.remove();
            }
        }

//        map.values().removeIf(integer -> integer < 500);

    }

    public static void main(String[] args) {

    }
}
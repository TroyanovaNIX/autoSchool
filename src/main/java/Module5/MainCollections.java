package Module5;

import java.time.LocalDate;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class MainCollections {

    public Set<String> initializeSetOfStrings() {
        Set<String> plants = new HashSet<String>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("жень-шень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");

        return plants;
    }

    public void printOfSet(Set<String> plants) {
        for (String plant :plants){
            System.out.println(plant);

        }
    }
    public Map<String, String> initializeMapOfPlants() {
        Map<String, String> plantsMap =new HashMap<String, String>();
        plantsMap.put("арбуз","ягода");
        plantsMap.put("банан","трава");
        plantsMap.put("вишня","ягода");
        plantsMap.put("груша","фрукт");
        plantsMap.put("дыня","овощ");
        plantsMap.put("ежевика","куст");
        plantsMap.put("жень-шень","корень");
        plantsMap.put("земляника","ягода");
        plantsMap.put("ирис","цветок");
        plantsMap.put("картофель","клубень");

        return plantsMap;

    }
    public  void printMapOfPlants(Map<String, String> plantsMap) {
        for (Map.Entry<String, String> pair : plantsMap.entrySet())

        {
            String key = pair.getKey(); //ключ

            String value = pair.getValue(); //значение

            System.out.println(key + " - " + value);
        }
    }
    public Map<String, Cat> initializeMapOfCats() {
        Cat cat1=new Cat("name1");
        Cat cat2=new Cat("name2");
        Cat cat3=new Cat("name3");
        Cat cat4=new Cat("name4");
        Cat cat5=new Cat("name5");
        Cat cat6=new Cat("name6");
        Cat cat7=new Cat("name7");
        Cat cat8=new Cat("name8");
        Cat cat9=new Cat("name9");
        Cat cat10=new Cat("name10");
        Map<String, Cat> catsMap =new HashMap<String, Cat>();
        catsMap.put(cat1.getName(),cat1);
        catsMap.put(cat2.getName(),cat2);
        catsMap.put(cat3.getName(),cat3);
        catsMap.put(cat4.getName(),cat4);
        catsMap.put(cat5.getName(),cat5);
        catsMap.put(cat6.getName(),cat6);
        catsMap.put(cat7.getName(),cat7);
        catsMap.put(cat8.getName(),cat8);
        catsMap.put(cat9.getName(),cat9);
        catsMap.put(cat10.getName(),cat10);

        return catsMap;

    }
    public  void printMapOfCats(Map<String, Cat> catsMap) {
        for (Map.Entry<String, Cat> pair : catsMap.entrySet())
        {
            String key = pair.getKey(); //ключ
            Cat value = pair.getValue(); //значение
            System.out.println(key + ":" + value);
        }
    }
public void printListOfKeys(Map<String, String> plantsMap){
    Set<String> keys=plantsMap.keySet();
    for (String key : keys)
    {
        System.out.println(key);
    }
}

public void printListOfValues(Map<String, String> plantsMap){
    Collection <String> vals=plantsMap.values();
    for (String val: vals)
    {
        System.out.println(val);
    }
}

    public Map<String, Object> initializeMapOfObjects() {
        Map<String, Object> objMap =new HashMap<String, Object>();
        objMap.put("obj1","string");
        objMap.put("obj2",5);
        objMap.put("obj3",5.5);
        objMap.put("obj4",'c');
        objMap.put("obj5",true);
        objMap.put("obj6",new Cat("Murzik"));
        objMap.put("obj7",-6.1F);
        objMap.put("obj8",0b1101);
        objMap.put("obj9",0x6F);
        objMap.put("obj10",2147483649L);

        return objMap;

    }
    public  void printMapOfobjects(Map<String, Object> objMap) {
        for (Map.Entry<String, Object> pair : objMap.entrySet())
        {
            String key = pair.getKey(); //ключ
            Object value = pair.getValue(); //значение
            System.out.println(key + ":" + value.toString());
        }
    }

    public List<String> initializeListOfStrings(){
        List<String> diffStr=new ArrayList<String>();

        diffStr.add("арбуз");
        diffStr.add("банан");
        diffStr.add("вишня");
        diffStr.add("груша");
        diffStr.add("дыня");
        return diffStr;
    }
    public void printListOfStrings(List<String> diffStr){
        for (int i=0; i<diffStr.size(); i++){
            System.out.println(diffStr.get(i));
        }
    }
    public List<String> initializeListOfStringsFromConsole(){
        List<String> diffStrConsole=new ArrayList<String>();

        Scanner scn=new Scanner(System.in);
        for (int i=0; i<5; i++){
            diffStrConsole.add(scn.next());
        }
        return diffStrConsole;
    }

    public List<String> longestStringInList(List<String> diffStrConsole) {
        List<String> longestStr=new ArrayList<String>();
        int min=0;
        for (int i=0; i<diffStrConsole.size(); i++){
            int tempLen=diffStrConsole.get(i).length();
            if (tempLen>min){
                min=tempLen;
                longestStr.clear();
                longestStr.add(diffStrConsole.get(i));
            }
            else
            if (tempLen==min){
                longestStr.add(diffStrConsole.get(i));
            }
        }
        return longestStr;
    }

    public List<String> shortestStringInList(List<String> diffStrConsole) {
        List<String> shortestStr=new ArrayList<String>();
        int min=0;
        for (int i=0; i<diffStrConsole.size(); i++){
            int tempLen=diffStrConsole.get(i).length();
            if (tempLen<min){
                min=tempLen;
                shortestStr.clear();
                shortestStr.add(diffStrConsole.get(i));
            }
            else
            if (tempLen==min){
                shortestStr.add(diffStrConsole.get(i));
            }
        }
        return shortestStr;
    }
    public List<String> listByAddingToTheTop() {
        List<String> list=new ArrayList<String>();
        Scanner scn=new Scanner(System.in);
        for (int i=0; i<10; i++){
            list.add(0,scn.next());
        }
        return list;
    }

    public List<String> replaceToTheTop(List<String> list11, int count) {
        for (int i=0; i<count; i++){
            String lastItem=list11.get(list11.size()-1);
            list11.remove(lastItem);
            list11.add(0,lastItem);
        }
        return list11;
    }
    public Set<String> initialSettOfStringsL(){
        Set<String> letterL =new HashSet<String>();
        letterL.add("Lарбуз");
        letterL.add("Lбанан");
        letterL.add("Lвишня");
        letterL.add("Lгруша");
        letterL.add("Lдыня");
        letterL.add("Lежевика");
        letterL.add("Lжень-шень");
        letterL.add("Lземляника");
        letterL.add("Lирис");
        letterL.add("Lкартофель");
        return letterL;
    }
    public  void printSetOfStringsL(Set<String> letterL){
        for (String word :letterL){
            System.out.println(word);
        }
    }
    public Set<Integer> initialSetOfInts() {

        Set<Integer> ints = new HashSet<Integer>();
        Random rnd = new Random();
        while (ints.size() < 7) {
            Integer r = rnd.nextInt() % 100;
            ints.add(r);
        }
        return ints;
    }
    public Set<Integer> removeItemsBiggerThanTen(Set<Integer> ints){
        for (Object num : ints.toArray())
        {
            if(((Integer )num)>10)
            {
                ints.remove(((Integer )num));
            }
        }
        return ints;
    }
    public void printSetOfInts(Set<Integer> ints){
        for (Integer num : ints)
            System.out.println(num);

    }
    public int amountOfDupNames(Map<String, String> personMap, String LastName, String FirtsName){
        int count=0;
        for (Map.Entry<String, String> pair : personMap.entrySet()){
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение

            if ((key.equals(LastName))|| (value.equals(FirtsName)) ) {count++;}
        }
        return count;
    }

    public Map<String, String> initializeMapOfPerson(){
        Map<String, String> personMap =new HashMap<String, String>();
        personMap.put("Ф1","И1");
        personMap.put("Ф2","И1");
        personMap.put("Ф3","И3");
        personMap.put("Ф0","И1");
        personMap.put("Ф4","И2");
        personMap.put("Ф5","И5");
        personMap.put("Ф6","И6");
        personMap.put("Ф7","И7");
        personMap.put("Ф8","И8");
        personMap.put("Ф9","И9");
        personMap.put("Ф10","И9");

        return personMap;
    }
    public Map<String, LocalDate>  initializeMapOfPersonBirth(){
        Map<String, LocalDate> personMap =new HashMap<String, LocalDate>();
        personMap.put("Ф1",LocalDate.of(1996, 5, 12));
        personMap.put("Ф2",LocalDate.of(1998, 1, 22));
        personMap.put("Ф3",LocalDate.of(2002, 3, 5));
        personMap.put("Ф0",LocalDate.of(1997, 5, 19));
        personMap.put("Ф4",LocalDate.of(1999, 8, 24));
        personMap.put("Ф5",LocalDate.of(1996, 8, 1));
        personMap.put("Ф6",LocalDate.of(1998, 7, 12));
        personMap.put("Ф7",LocalDate.of(1995, 9, 6));
        personMap.put("Ф8",LocalDate.of(1997, 5, 12));
        personMap.put("Ф9",LocalDate.of(1996, 6, 12));
        personMap.put("Ф10",LocalDate.of(1996, 10, 12));

        return personMap;
    }
    public Map<String, LocalDate> removePersonByMonth(Map<String, LocalDate> personMap){

        Map<String, LocalDate> newMap = personMap.entrySet().stream()
                .filter(entry -> (entry.getValue().getMonthValue()<6 ||
                        entry.getValue().getMonthValue()>8))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return newMap;

    }
    public void printMapOfPerson(Map<String, LocalDate> personMap){
        for (Map.Entry<String, LocalDate> pair : personMap.entrySet())

        {
            String key = pair.getKey(); //ключ
            LocalDate value = pair.getValue(); //значение

            System.out.println(key + " " + value.toString());

        }
    }
    public void printMapOfPerson_str(Map<String, String> personMap){
        for (Map.Entry<String, String> pair : personMap.entrySet())

        {
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение

            System.out.println(key + " " + value.toString());

        }
    }

    public Map<String, String> removePersonByFirstname(Map<String, String> personMap){
        Map <String,String> newPersonMap=new HashMap<String, String>();
        for(Map.Entry<String,String> en : personMap.entrySet()){
            String key = en.getKey(); //ключ
            String value = en.getValue(); //значение

        if((personMap.entrySet().stream()
                .filter(entry-> entry.getValue().equals(value)).count())==1)
            newPersonMap.put(key,value);

        }
        return newPersonMap;
    }

    public void addPerson(Map<String, List<String>> personMap,String LastName, String FirstName){

        if (personMap.keySet().contains(LastName)){
            List<String> firstNames;
            firstNames=personMap.get(LastName);
            firstNames.add(FirstName);
            personMap.replace(LastName, firstNames);

        }
        else
        {
            List<String> firstNames =new ArrayList<String>();
            firstNames.add(FirstName);
            personMap.put(LastName, firstNames);
        }
    }
    public  Map<String, List<String>> initializepersonMapDup() {
        Map<String, List<String>> personMap=new HashMap<String, List<String>>();
        addPerson(personMap,"l1","n1");
        addPerson(personMap,"l2","n2");
        addPerson(personMap,"l3","n3");
        addPerson(personMap,"l1","n4");
        addPerson(personMap,"l4","n1");
        addPerson(personMap,"l1","n5");
        addPerson(personMap,"l5","n4");
        addPerson(personMap,"l6","n1");
        addPerson(personMap,"l2","n7");
        addPerson(personMap,"l8","n8");
        return personMap;
    }

    public void printPersonMap(Map<String, List<String>> personMap){
        for (Map.Entry<String, List<String>> pair : personMap.entrySet())
        {
            String key = pair.getKey(); //ключ
            List<String> value = pair.getValue(); //список значений
            System.out.print(key + " ");
            for(String name : value){
                System.out.print( name.toString()+" ");
            }
            System.out.println();
        }
    }
    public  static void  main (String[] args){
        MainCollections mainCollections=new MainCollections();
/*
/////////HashSet из растений
    System.out.println("Subtask1. Print set of strings");
    mainCollections.printOfSet(mainCollections.initializeSetOfStrings());

///////2. HashMap из 10 пар
        System.out.println("Subtask2. Print map of plants");
        mainCollections.printMapOfPlants(mainCollections.initializeMapOfPlants());

///////3. Коллекция HashMap из котов
        System.out.println("Subtask3. Print map of Cats");
        mainCollections.printMapOfCats(mainCollections.initializeMapOfCats());

////////////4. Вывести на экран список ключей
        System.out.println("Subtask4. Print list of keys of plants");
        mainCollections.printListOfKeys(mainCollections.initializeMapOfPlants());

///////////5. Вывести на экран список значений
        System.out.println("Subtask5. Print list of values of plants");
        mainCollections.printListOfValues(mainCollections.initializeMapOfPlants());
///////6. Коллекция HashMap из Object
        System.out.println("Subtask6. Print map of objects");
        mainCollections.printMapOfobjects(mainCollections.initializeMapOfObjects());

////////////7. 5 различных строчек в списке
        System.out.println("Subtask7. Print list of strings");
        mainCollections.printListOfStrings(mainCollections.initializeListOfStrings());

        ////////8. Самая длинная строка
        System.out.println("Subtask8. The longest stringsfrom the list of strings");
        mainCollections.printListOfStrings(mainCollections.longestStringInList(mainCollections.initializeListOfStringsFromConsole()));

////////9. Самая короткая строка///---------------the same solution as previous task
        System.out.println("Subtask9. The shortest stringsfrom the list of strings");
        mainCollections.printListOfStrings(mainCollections.shortestStringInList(mainCollections.initializeListOfStringsFromConsole()));

////////10. 10 строчек в начало списка
        System.out.println("Subtask10. Put strings on the top of the list");
        mainCollections.printListOfStrings(mainCollections.listByAddingToTheTop());

/////////////11. Удали последнюю строку и вставь её в начало
        System.out.println("Subtask11. Replace last string to the top of the list");
        mainCollections.printListOfStrings(mainCollections.replaceToTheTop(mainCollections.initializeListOfStringsFromConsole(),13));

/////////Задачи на Set и Map
/////12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
        System.out.println("Subtask12. Replace last string to the top of the list");
         mainCollections.printSetOfStringsL(mainCollections.initialSettOfStringsL());

///////////////13. Создать множество чисел(Set<Integer>), занести туда 20 различных чисел. Удалить из множества все числа больше 10.
        System.out.println("Subtask13. Remove integers bigger than 10");
        Set<Integer> integers=mainCollections.initialSetOfInts();
        mainCollections.printSetOfInts(integers);
        System.out.println("----------------------------");
        mainCollections.printSetOfInts(mainCollections.removeItemsBiggerThanTen(integers));




//========================================================================================================================
////////14. Создать словарь (Map<String, String>) занести в него десять записей по принципу
//«Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию.



                System.out.print(mainCollections.amountOfDupNames(mainCollections.initializeMapOfPerson(), "Ф71", "И1"));


/// 15. Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
//      Удалить из словаря всех людей, родившихся летом.
        mainCollections.printMapOfPerson(mainCollections.removePersonByMonth(mainCollections.initializeMapOfPersonBirth()));
*/

//   16. Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
//    Удалить людей, имеющих одинаковые имена.

//        mainCollections.printMapOfPerson_str(mainCollections.removePersonByFirstname(mainCollections.initializeMapOfPerson()));


//                17.

  //              1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
  //              2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
  //              3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
  //              4. Вывести содержимое Map на экран.

        mainCollections.printPersonMap(mainCollections.initializepersonMapDup());

            }//end Main

        }//end class



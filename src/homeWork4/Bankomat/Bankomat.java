package homeWork4.Bankomat;
/*
Задача 2:
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100.
 Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
 */

import java.util.Scanner;

public class Bankomat {
    int twenty;
    int fifty;
    int hundred;
    int requiredSum;
    int totalSum;// Общая сумма в банкомате
    int totalCountTwenty;
    int totalCountFifty;
    int totalCountHundred;


    int addHundred;
    int addTwenty;
    int addFifty;
    boolean result;




    public Bankomat(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }


    public int addMoney(int addTwenty, int addFifty, int addHundred){

        this.twenty = twenty+ addTwenty;
        this.fifty =fifty + addFifty;
        this.hundred= hundred + addHundred;

       totalSum=twenty*20+fifty*50+hundred*100;
        System.out.println("Общая сумма в банкомате после добавления  составляет "+ totalSum);
       return totalSum;
    }

    public boolean withdrawMoney(int requiredSum){
        int rest=requiredSum; //невыданный остаток
        int tempHundred=0; // промежуточное количество 100 купюр
        int tempFifty=0; // промежуточное количество 50 купюр
        int tempTwenty=0;
        int enoughHundred;// сколько не хватило 100 купюр
        int enoughFifty;//Сколько не хватало 50 купюр

        int addFiftyCount;// Сумма, на которую не хватило 100
        int addTwentyCount;
        int addHundredSum;
        int addFiftySum;

        System.out.println("Общая сумма в банкомате составляет "+ totalSum);
        if (requiredSum<=totalSum){              //Требуемая сумма есть в банкомате
            int tempRegHundred=requiredSum/100; //Переменная Кол-во требуемых 100 купюр
                 if(tempRegHundred>=1){        //Нужны ли 100 купюры
                     enoughHundred =hundred-tempRegHundred;
                        if (enoughHundred>=0) {//Есть ли достаточное количество 100 купюр
                            tempHundred=tempRegHundred;
                            rest=rest-tempHundred*100;
                            hundred=hundred-tempHundred;
                            System.out.println("Нужная сумма в сотнях есть и будут выдана, остаток требуемой суммы равен "+rest);
                            if (rest==0){
                                result=true;
                                System.out.println("result " +result);
                                totalSum=twenty*20+fifty*50+hundred*100;
                                System.out.println("Баланс банкомата равен "+totalSum);
                                return result;
                            }
                        }else {
                            System.out.println("Нет достаточного количества купюр по 100, чтобы выдать все сумму. Рассмотрим возможность выдать по 50");
                            tempHundred=hundred;//Записываем количество 100 купюр, которые были, их отдаем
                            hundred=hundred-tempHundred;
                            rest=rest-tempHundred*100;
                            System.out.println("Часть суммы выдана 100 купюрами в количестве равном "+tempHundred);
                            enoughHundred=tempRegHundred-tempHundred; //сколько еще купюр нужно было по 100
                          addHundredSum= enoughHundred*100; //Сумма, которую надо выдать по 50
                           addFiftyCount=addHundredSum/50; // Количество купюр по 50
                            System.out.println("Количество купюр по 50, которые выдаем в рамках 100 равно "+addFiftyCount);
                                  if (fifty>=addFiftyCount){
                                      tempFifty=addFiftyCount; //сколько купюр по 50 нужно
                                      rest=rest-tempFifty*50;//Выдали остаток по 50
                                      fifty=fifty-tempFifty;
                                      totalSum=twenty*20+fifty*50+hundred*100;
                                      System.out.println("Выдали остаток суммы по 50, остаток требуемой суммы равен "+rest);
                                      System.out.println("Баланс банкомата равен "+totalSum);
                                               if(rest==0){
                                                   result=true;
                                                   System.out.println("result равен "+result);
                                               }
                                  } else {//не хватило по 50, смотрим по 20
                                      System.out.println("Нет нужного количества 50 купюр, проверяем возможность выдать двадцатками");
                                      tempFifty=fifty; // Отдали 50 купюры, которые были
                                      fifty=fifty-tempFifty;
                                      rest=rest-tempFifty*50;
                                      System.out.println("Выдано купюрами по 50 в штуках "+tempFifty+ " Остаток суммы равен "+rest);
                                      enoughFifty=addFiftyCount-tempFifty; //Сколько осталось отдать в количестве по 50
                                      addFiftySum=enoughFifty*50; //Сумма, которую надо отдать по 20
                                      System.out.println("Сумма, которую надо выдать двадцатками равна "+addFiftySum);
                                      addTwentyCount=addFiftySum/20; //Количество 20 купюр, которые надо выдать
                                         if(twenty>=addTwentyCount){
                                             tempTwenty=addTwentyCount;
                                             rest=rest-tempTwenty*20;
                                             twenty=twenty-tempTwenty;
                                             System.out.println("Выдали остаток суммы по 20, остаток требуемой суммы равен "+rest);
                                             totalSum=twenty*20+fifty*50+hundred*100;
                                             System.out.println("Баланс банкомата равен "+totalSum+" По купюрам двадцатки- "+twenty+"пятидесятки -"+fifty+"сотки -"+hundred);
                                             result=true;
                                             System.out.println("result равен "+result);
                                         } else {
                                             result=false;
                                             System.out.println("Не можем выдать по причине отсутствия купюр двадцатками");
                                         }
                                  }
                        }
            }

        }else {
            result=false;
            System.out.println("Не можем выдать нужную сумму, т.к в банкомате нет требуемой суммы");
            System.out.println("result равен "+result);
        }

        if (rest/50==1){
            if (fifty>=1){
                tempFifty++;
                fifty=-1;
                rest=rest-50;
                    if(rest==0){
                        result=true;
                        System.out.println("Выдана пятидесятка в рамках десятков. Остаток суммы равен "+rest);
                    }
            }else {
                if (rest%20==0){
                   int twentyCount= rest/20;
                      if (twenty>=twentyCount){
                          tempTwenty=+twentyCount;
                          twenty=-twentyCount;
                          rest=-twentyCount*20;
                                if (rest==0){
                                    result=true;
                                    System.out.println("Остаток суммы выдан двадцатками в количестве равном "+twentyCount+"Остаток суммы равен "+rest);
                                }
                      }else {
                          System.out.println("Нет достаточного количества двадцаток");
                          result=false;
                          System.out.println("result равен "+result);

                      }
                }else {
                    System.out.println("Нет пятидесяток, а двадцатками выдать не можем");
                    result=false;
                    System.out.println("result равен "+result);
                }
            }
        }else {
            if (rest%20==0){
                int twentyCount= rest/20;
                if (twenty>=twentyCount){
                    tempTwenty=+twentyCount;
                    twenty=-twentyCount;
                    rest=-twentyCount*20;
                    if (rest==0){
                        result=true;
                        System.out.println("Остаток суммы выдан двадцатками в количестве равном "+twentyCount+"Остаток суммы равен "+rest);
                    }
                }else {
                    System.out.println("Нет достаточного количества двадцаток(Остаток был меньше 50)");
                    result=false;
                    System.out.println("result равен "+result);

                }
            }else {
                System.out.println("Нет достаточного количества двадцаток (Остаток был меньше 50)");
                result=false;
                System.out.println("result равен "+result);
            }
        }


        return result;
    }




    }


package com.syntax.reviewclass11.interfacepage;

public interface Finance {


void takeCredit();

interface FederalBank extends Finance {

    void checkBalanceInFederalBank();

    void checkInterestAmountInFederalBank();

    static void depositMoney() {
        System.out.println("Money is deposited");
    }

}
    class AllyBank {

        public void emiPolicy() {
            System.out.println("Here u ll get all ....");
        }


    }


   class PNC extends AllyBank implements FederalBank{


       @Override
       public void takeCredit() {
           System.out.println("It checks credit");
       }

       @Override
       public void checkBalanceInFederalBank() {
           System.out.println("It checks balance");
       }

       @Override
       public void checkInterestAmountInFederalBank() {
           System.out.println("It checks interest");
       }
   }










}


















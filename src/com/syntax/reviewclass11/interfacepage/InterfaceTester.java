package com.syntax.reviewclass11.interfacepage;


public class InterfaceTester {

    public static void main(String[] args) {

        Finance f=new Finance.PNC();

        f.takeCredit();

        Finance.FederalBank f2=new Finance.PNC();

        f2.checkBalanceInFederalBank();
        f2.checkInterestAmountInFederalBank();
        f2.takeCredit();



    }




}

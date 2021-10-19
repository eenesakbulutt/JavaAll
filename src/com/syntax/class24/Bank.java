package com.syntax.class24;

class StateBank {

  double money;
  double fee;
  StateBank(double money,double fee){
      this.money=money;


  }

    public void chargeFee(){
      if(money<10000){
          fee=money*0.01;

      }else{
          fee=money*0.02;
      }

  }

class BOA extends StateBank{

    BOA(double money, double fee){
        super(money,fee);
    }
      @Override
   public void chargeFee(){
if(money<500){
    fee=money*0.02;

}else{
    fee=0;
}

   }

}

class Chase extends StateBank{

    Chase(double money,double fee){
        super(money,fee);
    }

     public void chargeFee(){
        fee=0;
     }

}


}

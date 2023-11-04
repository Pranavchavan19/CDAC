//#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
void Account_info()
{
    int n=1001;
  printf("\nEnter Your Account Number:");
  scanf("%d",&n);
  if(n==1001)
  {
    printf("\nYour Account Is Verified");
    
  }
  else{
     printf("\nYou Entered wrong Account Number");
  }

 char ac[]  ="\npranav Bappa Chavan";
 
  if(ac=="\npranav Bappa Chavan" )
  {
  printf("\nAccount Holder Name :%s",ac);
 
 
  }
  printf("\nAccount Holder MO no : 7666477249");
   printf("\nAccount  Holder Address :At post Wathwada Tq Dharashiv kallamb");
   ////////////////////////////////////////////////////////////////////
   
  //  int accountNumber;
  //   printf("Enter your account number");
  //   scanf("%d",&accountNumber);
    
    
  //   for (int i = 1001; i < accountNumber; i++) {
  //       if (accountNumber == accountNumber) {
         
  //         printf("Account Number: ",name);
  //           return;
  //       }
 
};

void account()
{
   char name[33];
   char name1[33];
   char name2[33];
    char address[290];
    long long cont;
    int  init_depo;
    int  i=1001;
        system("cls");

   
     printf("\nEnter Your Name ");
     scanf("%s",&name,&name1,&name2);
      printf("\nEnter Your Address ");
     scanf("%S",&address);
      printf("\nEnter Your Contact Details ");
     scanf("%ld",cont);
     printf("\nEnter your Initial deposite Amount ");
     scanf("%d",& init_depo);
     if(init_depo<1000)
     {
      printf("\nPlease Deposite minimum 1000 RS ");
     }
      else if(init_depo>=1000)
     {
        printf("\n Congrutaliation Your Account is Succesifually credited");
        printf("\n Your SP Bank Account Number is :%d",i);
     
        // scanf("%d",&i);
     }
     
    
     

 
};
void Cash_Withdrawal()
{
  int n=1001;
   printf("\n WElcome To Our Cash Counter  ");
   printf("\n Enter Your Bank Account Number :");
   
   scanf("%d",&n);
   if(n==1001)
   {
      printf("\n Successifully login ");
   }
   else{
         printf("\nLogin Failed please try agin");
   }
   int j;

   printf("\nEnter Withdraw Amount :");
   scanf("%d",&j);
   int amount;



   int o;
printf("\nEnter Your OTP =");
scanf("%d",&o);


if(o==9999)
{
  printf("\n Withdraw Successfully");
}
else{
  printf("\nYou Entered Invalid OTP");

}
printf("\n BalanCe Enquiry");
printf("\n to Check Balance In Account press yes ");
char a;
scanf("%s",&a);
printf("total balance =1000");


 

};
void cash_deposit()
{
 
  
     printf("\nEnter Your Account Number : ");
    int i=1001;
    scanf("%d",&i);
    if(i==1001)
    {
     
      printf("\n  Verify Successfully :");
    }
    else  {
      char n;
      printf("\n you Entered Wrong  Id");
      printf("\nInvalid Creditals");
      
     
    };
    
  
    printf("\n");

    int id;
    printf("\nEnter your LOg In  Id :");
    scanf("%d",&id);
    int k=8374;
    if(k==8374)
    {
        printf("\nEnter Your Bank Password :");
    }
    else
    {
        printf("\n you Entered Wrong  Id");
      printf("\nInvalid Creditals");
    }
    char pass[] ="pranav@123";
    scanf("%s",&pass);
    
    printf("\n Accout Balance : 1000 RS");
    printf("\n------------------------------------------------------------------------------------------------------------------------------");
    int a;
    printf("\n Cash Deposite Amount in Rs :");
    scanf("%d",&a);
    int deposite_amount=1000;
    int total=deposite_amount+a;
    printf("\n  Total Deposite  amount  in Rs=%d",total);

    
    
  
};
void Log_Out()
{
  char a;
  printf("\n Sign out------------------------------------------------------------------------- ");
   printf("\n____________________________________________________________________________________________________________________");
  printf("\nTo LOg Out press Yes");
  scanf("%s",&a);
   system("cls");
    printf("\nThank You ");
    char t;
     scanf("%c",&t);
};
int   main()
{
       int n;
       char j;
       
    while (true)

    {
    printf("\n                                                   *   Welcome   *                         ");
    scanf("%c",&j);
//    system("clear");
    printf("\n                                                   $$$   SP BANK   $$$                         ");
    // system("clear");
    printf("\n");
         printf("\n (1) Creating New Account\t (2) Cash Deposit\t (3) Cash Withdrawal\t (4) Display Account Information\t (5) Log Out\n");
     printf("\n");
    printf("\n                                                Please Select Your Choise "                    );
    scanf("%d",&n);
         switch (n)
    {
        
       case 1: printf("\nCreating New Account");
        account();
        break;
        case 2: printf("\nCash Deposit");
        cash_deposit();
        break;
        case 3: printf("\nCash Withdrawal");
        Cash_Withdrawal();
        break;
        case 4: printf("\nDisplay Account Information");
        Account_info();
        break;
        case 5: printf("\nLog Out");
        Log_Out();
        break;
        case 6: printf("\nInvalid Creditals");
        break;
        default:printf("Invalid choice. Please try again.");
        break;
      }
    }
  
}
#include <iostream>
#include <string>
#include <stdbool.h>
using namespace std;

class student
{
private:
   float m1, m2, m3, m4, m5, m6;

   long long int prn;
   int name;

public:
   // void nam();
   void sem1();
   void sem2();
   void sem3();
   void sem4();
   void sem5();
   void sem6();
   void sem7();
   void sem8();
   void result1();
   void result2();
   void result3();
   void result4();
   void result5();
   void result6();
   void result7();
   void result8();
};
class Stu_portal
{
 
 
   private :
  
   public :
   long  int z2=192133;
   void showw()
   {
  int z1;
  char c;
  cout<<"Welcome to Student portal"<<endl;
      cout<<"\nEnter yes";
    cin>>c;
    int n;
    cout<<"\nchoose your option:";
    cin>>n;
    switch (n)
    {
    case 1:
     cout<<"\ncourse Details ------>";
      break;
    
    default:
      break;
    }
    cout<<"\nAbout university---->";
     cout << "\nDr. Babasaheb Ambedkar Technological University (DBATU) was established by the Government of Maharashtra through the enactment of the Dr. Babasaheb Ambedkar Technological University Act, No. XXII of 1989. Initially, it functioned as a Unitary University. However, in 2016, the Government of Maharashtra transformed it into an Affiliating Technological University, as per the provisions of Dr. Babasaheb Ambedkar Technological University Act No. XXIX of 2014. This restructuring expanded the university's jurisdiction to cover the entire state of Maharashtra.";

    cout << "\nPresently, DBATU affiliates with 272 institutes, contributing to a substantial student body totaling 1,36,534. The university's campus, sprawling across 468 acres, serves as a prominent seat of learning, attracting meritorious students from all corners of the state. DBATU is dedicated to molding these students into employable engineers and competent technocrats.";

    cout << "\nThe university is equipped with state-of-the-art laboratories that offer extensive testing and analysis facilities, extendable for the benefit of industries. In addition, DBATU provides essential amenities such as conference halls, auditoriums, playgrounds, workshops, and computing facilities. The university's commitment to providing a conducive learning environment is further reflected in its spacious and well-appointed hostels.";

    cout << "\nThe strength of DBATU lies in its highly qualified faculty members who are deeply committed to imparting knowledge through an effective teaching-learning process. Recognizing that achieving excellence is a continuous challenge, the faculty and staff tirelessly strive for it.";

    cout << "\nMoreover, DBATU facilitates an environment that fosters research and innovation among its students. This emphasis on creativity and exploration not only enhances the educational experience but also contributes to the development of entrepreneurial skills among the student body.";

    cout << "\nThe university is empowered to affiliate institutions offering a diverse range of programs at the undergraduate, postgraduate, and Ph.D. levels. These programs span across the disciplines of Engineering, Pharmacy, Architecture, and Hotel Management & Catering Technology.";

    // Additional details
    cout << "\n\nAdditional Details:\n";
    cout << "1. DBATU's laboratories are equipped with cutting-edge technology, providing students with hands-on experience.\n";
    cout << "2. The university's research centers focus on groundbreaking projects, fostering a culture of innovation.\n";
    cout << "3. DBATU has established collaborations with industry leaders, creating valuable opportunities for students.\n";
    cout << "4. The university actively promotes extracurricular activities, ensuring a holistic development of its students.\n";
    cout << "5. DBATU's commitment to sustainability is evident in its eco-friendly initiatives across the campus.\n";

    // More details
    cout << "\n\nFurther Details:\n";
    cout << "6. DBATU's alumni network is actively engaged, providing mentorship and career guidance to current students.\n";
    cout << "7. The university conducts regular industry-oriented workshops and seminars to keep students abreast of the latest technological trends.\n";
    cout << "8. DBATU emphasizes a global perspective, encouraging student exchange programs and collaborations with international universities.\n";
    cout << "9. The university's library is a vast repository of academic resources, enhancing the research capabilities of students and faculty.\n";
    cout << "10. DBATU's commitment to inclusivity is reflected in various scholarship programs to support students from diverse backgrounds.\n";

    // Special Highlights
    cout << "\n\nSpecial Highlights:\n";
    cout << "11. DBATU takes pride in its unique 'Industry Immersion Program,' providing students with hands-on experience in real-world industrial settings.\n";
    cout << "12. The university hosts an annual 'Innovation Fair' showcasing groundbreaking projects and ideas developed by students.\n";
    cout << "13. DBATU has a dedicated 'Entrepreneurship Cell' that nurtures and supports aspiring student entrepreneurs.\n";
    cout << "14. The university's 'Global Connect Initiative' encourages students to participate in international conferences and collaborative projects.\n";
    cout << "15. DBATU's commitment to social responsibility is evident in its various community outreach programs and initiatives.\n";


//     if(z1==z2)
//     {

//        cout<<"valid Entry";
//     }
//     else
//     {
//  cout<<"Please enter Valid password";
//     }

   }

};
class portal :public Stu_portal
{
 void showw2()
 {

   showw();
 }
   
};

//  void student::nam()
//  {

//    cout << "\n____________________________________________________________________________________________________________________________";
//     cout << "\nEnter Your PRN NO:";
//    cin >> prn;
//     cout << "\nEnter Your Password";
//     cin >> name;
//     long long int prn1 = 192133;

//     if (prn == prn1)
//     {

//        cout << "\n______________________________________________________________________________________________________________________________";
//        cout << "\nLogin Successfully  --> PRN Verified";
//        cout << "\n______________________________________________________________________________________________________________________________";
//     }
//     else
//     {
//        cout << "\n______________________________________________________________________________________________________________________________";
//        cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

//        cout << "\n______________________________________________________________________________________________________________________________";
//     }

//     // cin>>name;
//  }
void student ::sem1()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nLogin Successfully  --> PRN Verified";
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n subject :Engineering Mathematics III";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject :Building Technology and Materials";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject :Engineering graphics I";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject :Surveying";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject :Strength of Materials";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject :Geotechnical Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";
      cout << "\n______________________________________________________________________________________________________________________________";
   };
}
void student::result1()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nLogin Successfully  --> PRN Verified";
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of First Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n       Subject Name ";
      cout << "                                                     \tMarks Out Of 100";
      cout << "                             \tRemaks";

      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nEngineering Mathematics III                                                         " << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";

      cout << "\nBuilding Technology and Materials                                                   " << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nEngineering graphics I                                                              " << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nSurveying                                                                           " << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nStrength of Materials                                                               " << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nGeotechnical Engineering                                                            " << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
/*class resultt :public student

{

  int res1();
};*/

void student ::sem2()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {

      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nLogin Successfully  --> PRN Verified";

      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n subject  :Hydrology and Water Resources Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :Water Supply Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :Design of Steel Structures";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Engineering Economics and Financial Management";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Elective I ";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject :Lab section-GTE";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result2()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {

      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Second Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n       Subject Name ";
      cout << "                                                     \tMarks Out Of 100";
      cout << "                             \tRemaks";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nHydrology and Water Resources Engineering                                               " << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nWater Supply Engineering                                                                " << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Design of Steel Structures                                                             " << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Engineering Economics and Financial Management                                         " << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nElective I                                                                              " << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Lab section-GTE                                                                        " << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::sem3()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {

      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nLogin Successfully  --> PRN Verified";
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";

      cout << "\n subject  :Hydrology and Water Resources Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :Foundation Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :Transportation Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Project Stage I";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Transportation Engineering Lab";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject  :Computer Programming in Civil Engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result3()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Third Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Hydrology and Water Resources Engineering =" << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nFoundation Engineering =" << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nTransportation Engineering  =" << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nProject Stage I  =" << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Transportation Engineering Lab =" << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Computer Programming in Civil Engineering =" << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::sem4()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {

      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nLogin Successfully  --> PRN Verified";
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";

      cout << "\n subject  :Building Technology and Architectural Planning";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :Mechanics of structure";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :Fluid Mechanics";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Engineering Mathematics III";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Engineering Geology";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject  :Building Technology and Architectural Planning Lab";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result4()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Fourth Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nSoil Mechanices I   =" << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Building Technology and Architectural Planning =" << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Mechanics of structure =" << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Engineering Mathematics III =" << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nEngineering Geology  =" << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Building Technology and Architectural Planning Lab =" << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::sem5()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {

      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nLogin Successfully  --> PRN Verified";
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n subject  :Hydrology and water resource engineering";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :Infrastructure Engineering and Construction Techniques";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :Structural Design-I";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Structural Analysis-I";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Fluid Mechanics- II";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject  :Employability Skill Development";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result5()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Fifth Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Hydrology and water resource engineering =" << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Infrastructure Engineering and Construction Techniques =" << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nStructural Design-I  =" << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Structural Analysis-I =" << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Fluid Mechanics- II=" << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n  Employability Skill Development=" << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student ::sem6()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {

      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n subject  :Fluid Mechanics I";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :Architectural Planning and Design of Buldings";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :Structural Analysis II";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Engineering Geology";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Concrete Technology";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject  :Soft Skill";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result6()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Sixth Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nFluid Mechanics I  =" << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nArchitectural Planning and Design of Buldings  =" << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nStructural Analysis II  =" << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nEngineering Geology  =" << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Concrete Technology =" << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nSoft Skill  =" << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::sem7()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n subject  :Engineering Physics / Engineering Chemistry";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :structural Fundamental I";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :Programming and Problem Solving / Engineering Mechanics";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Project Based Learning";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Geo Technical Engineering & lab Works Fundamental";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject  :Project  & professional Development";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result7()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Seventh Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Engineering Physics / Engineering Chemistry =" << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n structural Fundamental I =" << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nProgramming and Problem Solving / Engineering Mechanics  =" << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nProject Based Learning=" << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nGeo Technical Engineering & lab Works Fundamental  =" << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Project  & professional Development =" << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::sem8()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\nPRANAV BAPPA CHAVAN";
      cout << "\nEnter Your Marks of Following subject:";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n subject  :Project-II";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m1;
      cout << "\n subject  :Soil Mechanics";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m2;
      cout << "\n subject  :LAB-Work";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m3;
      cout << "\n subject  :Dsign Of Steel Structure";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m4;
      cout << "\n subject  :Professional Practice";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m5;
      cout << "\n subject  :Concrete Technology -II";
      cout << "\n_________ Enter Your Marks Out Of 100 ______________";
      cin >> m6;
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}
void student::result8()
{
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nCheck Result Semester";
   cout << "\n____________________________________________________________________________________________________________________________";
   cout << "\nEnter Your PRN NO:";
   cin >> prn;
   cout << "\nEnter Your Password";
   cin >> name;
   long long int prn1 = 192133;

   if (prn == prn1)
   {
      cout << "\n____________________________________________________________________________________________________________________________";
      float total = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);
      cout << "\nPercentage Of Eighth Sem:" << total;
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n Project-II =" << m1;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m1 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";

      cout << "\n Soil Mechanics =" << m2;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m2 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\n LAB-Work =" << m3;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m3 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nDsign Of Steel Structure  =" << m4;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m4 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nProfessional Practice  =" << m5;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m5 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      cout << "\n____________________________________________________________________________________________________________________________";
      cout << "\nConcrete Technology -II  =" << m6;
      cout << "\n____________________________________________________________________________________________________________________________";
      if (m6 >= 35)
      {
         cout << "\tpass";
      }
      else
      {
         cout << "\tfail";
      }
      if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35 && m6 > 35 && total >= 35)
      {
         cout << "\nResult = Pass";
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
      {
         cout << "\nResult=ATKT";
         try
         {
            if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total >= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw " Execption --> Your Result is on hold due to Failed, but you can take admission to futher year / Semester";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *p)
         {
            cout << "\n"
                 << p;
         }
      }
      else if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35 || m6 < 35 && total <= 35)
      {
         cout << "\nResult=Fail";
      }
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      if (total >= 35 && total < 50)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n Third  class Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 50 && total < 65)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nSecond class";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 65 && total <= 75)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\n First Pass";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else if (total >= 75 && total <= 100)
      {
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\n___________________________________________________________________________________________________________________________";
         cout << "\nFirst Class With Distinction ";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      }
      else
      {

         cout << "\n___________________________________________________________________________________________________________________________";
         try
         {
            if (total <= 35)
            {
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
               throw "\nYou Are Fail You Are Going to Reappear the exam";
               cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
            }
         }
         catch (const char *j)
         {
            cout << j;
         }
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nResult=Fail";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         // char t;
         // cout<<t;
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
         cout << "\nDo You Want TO Attend REMEDIAL Exam";
         cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

         cout << "\nChoose Your Option";

         cout << "\n1-YES";
         cout << "\n2-NO";
         cout << "\n";
         int n;
         cin >> n;
         switch (n)
         {
         case 1:
            cout << "Yes";
            cout << "\n*********************************************************************************************************";
            long long int a;
            cout << "\n*********************************************************************************************************";
            cout << "\nFill Your Form";
            cout << "\n*********************************************************************************************************";
            cout << "\nEnter Your PRN Number=";
            cin >> a;
            cout << "\n*********************************************************************************************************";

            //  char s1[73];
            // char s2[73];
            // char s3[73];
            string s1;
            cout << "\nEnter Your Full Name=";
            cin >> s1;
            // cin>>s2[73];
            // cin>>s3[73];
            string z;
            cout << "\nEnter Your Failed Subject name:";

            cin >> z;

            cout << "\n*********************************************************************************************************";
            int m;

            cout << "\nEnter Your Fees For Subject Remedial: 222 rs Per Subject";
            cout << "\nEnter Money= ";
            cin >> m;
            cout << "\n##################################################################################################################";
            cout << "\nCandidate DEtails ---->";
            cout << "\nMoney Paid=:  -->" << m;

            cout << "\nCandidate Name:  -->" << s1 << endl;

            cout << "\ncandidate PRN Number  -->" << a << endl;

            cout << "\nCandidate Fail In Subjects: -->" << z << endl;
            cout << "\n##################################################################################################################";
            cout << "\n*********************************************************************************************************";
            cout << "\nThank You";
            cout << "\n*********************************************************************************************************";

            break;

            break;
         }
      }
   }
   else
   {
      cout << "\n______________________________________________________________________________________________________________________________";
      cout << "\nInvalid Login  --> Please Enter Correct PRN Number";

      cout << "\n______________________________________________________________________________________________________________________________";
   }
}

void info()
{

   cout << "\n______________________________________________________________________________________________________________________________";
   cout << "\nLogin Successfully  --> PRN Verified";
   cout << "\n______________________________________________________________________________________________________________________________";
   cout << "\nCANDIDATE NAME --> PRANAV BAPPA CHAVAN";
   cout << "\nCANDIDATE PRN NO --> 1921331191035";
   cout << "\nCANDIDATE DEGREE--> B-TECH IN CIVIL ENGINEERING";
   cout << "\nUNVERSITY NAME --> DR.BABASAHEAB AMBEDKAR TECHNOLOGY LONERE";
   cout << "\nCANDIDATE CONTACT --> 7666477249";
   cout << "\nCANDIDATE ADDRESS DETAILS --> WATHWADA DHARASHIV MAHARASHTRA 413510";
}
void marksheet()
{
   cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
   cout<<"\nEnter Your All Semester % for creating Degree Certificate";
   cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
   float b1, b2, b3, b4, b5, b6, b7, b8, c1;
   cout << "______________________________________________________________________________________________________________________________";
   cout << "Enter Your First Semester Percentage";

   cout << "______________________________________________________________________________________________________________________________";

   cin >> b1;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Second Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b2;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Third Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b3;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Fourth  Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b4;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Fifth Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b5;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Sixth Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b6;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Seventh Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b7;
   cout << "______________________________________________________________________________________________________________________________";

   cout << "\n                                                                    Enter Your Eights Semester Percentage";
   cout << "______________________________________________________________________________________________________________________________";

   cin >> b8;
   cout << "______________________________________________________________________________________________________________________________";

   c1 = ((b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8) / 8);
   cout << "\n______________________________________________________________________________________________________________________________";

   if (c1 >= 35)
   {
      //     std::string degreeName = "Bachelor of Technology ";
      //  std::string recipientName = "PPRANAV BAPPA CHAVAN";
      //  int graduationYear = 2022;

      //  // Outputting degree certificate data
      //  std::cout << "Degree Certificate Data:\n";
      //  std::cout << "Degree Name: " << degreeName << "\n";
      //  std::cout << "Recipient Name: " << recipientName << "\n";
      //  std::cout << "Graduation Year: " << graduationYear << "\n";
      // Certificate data
      std::string recipientName = "PRANAV BAPPA CHAVAN";
      //   cout << "______________________________________________________________________________________________________________________________";
      //  cout << "______________________________________________________________________________________________________________________________";

      std::string universityName = "Dr. Babasaheb Ambedkar Technological University";
      //  cout << "______________________________________________________________________________________________________________________________";

      std::string programName = "\nBachlore Of Technology : Civil Engineering";
      // cout << "______________________________________________________________________________________________________________________________";

      std::string sponsoredBy = "\nDBATU Lonare - Raigad";
      // cout << "______________________________________________________________________________________________________________________________";

      // std::string refNumber = "\n";
      // cout << "______________________________________________________________________________________________________________________________";

      std::string duration = "\nNovember 06-17, 2019 to 2022";
      //  cout << "______________________________________________________________________________________________________________________________";

      std::string organizedBy = "\nCivil Engineering, Dr. Babasaheb Ambedkar Technological University";
      // cout << "______________________________________________________________________________________________________________________________";

      std::string coordinatorName = "\nDr. S.L. Nalbalwar";
      //  cout << "______________________________________________________________________________________________________________________________";

      std::string coordinatorTitle = "\nFDP Coordinator & Head, Dept. of CE";

      cout << "______________________________________________________________________________________________________________________________";
      cout << "______________________________________________________________________________________________________________________________";

      // Printing the certificate data
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\nDEGREE CERTIFICATE -----";
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      cout << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      std::cout << "\nThis is to certify that   : " << recipientName << "\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"
                << "\nof " << universityName << "\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"
                << "\nhas attended and successfully completed a\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                << programName << "\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                << "\nsponsored by " << sponsoredBy << "\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                // << "\n(Vide Ref: " << refNumber << ")\n"
                << "\nduring " << duration << " organized by " << organizedBy << ".\n\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                << coordinatorName << "\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                << coordinatorTitle << "\n"
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                << "\ngrade" << c1
                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

                << "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
   }
}

int main()

{
   system("cls");
   // cout<<"Enter your password";
   
portal ddddd;

   //  Stu_portal::showw ;
   //  ddddd.showw();
     ddddd.showw();

   cout << "\n______________________________________________Welcome  DBATU University_______________________________________________________";

   cout << "\n______________________________________________________________________________________________________________________________";
   cout << "\n____________________________________________________________________________________________________________________________";
  
     
       
   //   student a;
   //   a.nam();
   info();

   // while (true)
   //  {

   cout << "\n______________________________________________________________________________________________________________________________";
   cout << "\n 1- First Semester";
   cout << "\n 2- Second  Semester";
   cout << "\n 3- Third Semester";
   cout << "\n 4- Fourth Semester";
   cout << "\n 5- Fifth Semester";
   cout << "\n 6- Sixth Semester";
   cout << "\n 7- Seventh Semester";
   cout << "\n 8- Eigth Semester";
   //cout << "\n 9- Student portal";
   cout << "\n_____________________________________________________________________________________________________________________________________";
   cout << "\n_______________________________________________________________________________________________________________________________________";

   int n1;
   cout << "\nChoose your option: ";
   cin >> n1;
   switch (n1)
   {
   case 1:
      cout << "\nSemster first";
      student s;
      s.sem1();
      cout << "\n______________________________________________________________________________________________________________________________________________";
      s.result1();
       
      break;
      cout << "\n____________________________________________________________________________________________________________________________";

   case 2:
      cout << "\nSemster two";
      student m;
      m.sem2();
      cout << "\n____________________________________________________________________________________________________________________________";
      m.result2();
      break;
      cout << "\n____________________________________________________________________________________________________________________________";
   case 3:
      cout << "\nSemster three";
      student l;
      l.sem3();
      cout << "\n____________________________________________________________________________________________________________________________";

      l.result3();

      break;
      cout << "\n____________________________________________________________________________________________________________________________";
   case 4:
      cout << "\nSemster four";
      student o;
      o.sem4();
      cout << "\n____________________________________________________________________________________________________________________________";

      o.result4();

      break;
      cout << "\n____________________________________________________________________________________________________________________________";
   case 5:
      cout << "\nSemster five";
      student p;
      p.sem5();
      cout << "\n____________________________________________________________________________________________________________________________";

      p.result5();

      break;
      cout << "\n____________________________________________________________________________________________________________________________";
   case 6:
      cout << "\nSemster six";
      student u;
      u.sem6();
      cout << "\n____________________________________________________________________________________________________________________________";

      u.result6();

      break;
      cout << "\n____________________________________________________________________________________________________________________________";
   case 7:
      cout << "\nSemster Seven";
      student y;
      y.sem7();
      cout << "\n____________________________________________________________________________________________________________________________";

      y.result7();

      break;
      cout << "\n____________________________________________________________________________________________________________________________";
   case 8:
      cout << "\nSemster Eight";
      student f;
      f.sem8();
      cout << "\n____________________________________________________________________________________________________________________________";

      f.result8();
      marksheet();
      

      int n;
      cout << "Choose Your option";
      cin >> n;
      switch (n)
      {
      case 1:
         cout << "\nResult Semester 1:";

         break;

      default:
         break;
      }

      //   Marksheet f;
      //   f.show1();
      //   f.show2();

      break;


      cout << "\n____________________________________________________________________________________________________________________________";
         
   default:
      break;
   }
   }
//}                                                    
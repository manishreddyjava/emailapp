package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultLenghtPassword=10;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySufix="usf.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created"+this.firstName+" "+this.lastName);

        this.department=setDepartment();
        System.out.println("Depaartment"+this.department);

        this.password=randomPassword(defaultLenghtPassword);
        System.out.println("password is: "+this.password);

        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySufix;
        System.out.println("email is: "+ email);


    }
    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code: ");
        Scanner in=new Scanner(System.in);
        int depChoice= in.nextInt();
        if (depChoice==1){return "sales";}
        else if (depChoice==2){return "Development";}
        else if (depChoice==3){return "Accounting";}
        else  {return " ";}

    }
    private String randomPassword(int lenght){
        String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ12344567890!@#$$%^&*()";
        char[]password=new char[lenght];
        for (int i=0;i<lenght;i++){
            int rand=(int)(Math.random()*passwordset.length());
            password[i]=passwordset.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

package WorkOut.Inheritance_day37.workOut.scrumTask;

import javax.swing.plaf.ScrollBarUI;

public class AmazonInc {

    public static void main(String[] args) {

       String company="Amazon Inc";
        ProductOwner po = new ProductOwner("Suhaib",29,'M',1,160000,company);

        BusinessAnalyst ba=new BusinessAnalyst("Cihad",30,'M',2,150000,company);

        ScrumMaster sm= new ScrumMaster("Anel",26,'F',3,145000,company);

        Tester tester  = new Tester("Rabia",32,'F',"QA",1415,125000,company);
        Tester tester1 = new Tester("Yasaman",31,'F',"QA",1416,130000,company);
        Tester tester2 = new Tester("Irena",29,'F',"SDET",1417,128000,company);
        Tester tester3 = new Tester("Cihad",26,'M',"QA",1418,125000,company);

        Tester[] testers={tester,tester1,tester2,tester3};

        Developer developer=new Developer("Daniela",27,'F',"Java Developer",8,135000,company);


        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("--------------------------------------------");

        for (Tester tester4: scrumTeam.testers) {
            System.out.println(tester4.name+" : "+tester4.salary);

        }

        System.out.println("--------------------------------------------");

        for(Developer developer1: scrumTeam.developers){
            System.out.println(developer1.name+" : "+ developer1.salary);
        }


    }
}

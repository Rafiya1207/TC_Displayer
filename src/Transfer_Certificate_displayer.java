import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;

public class Transfer_Certificate_displayer {

    public static void main(String[] args) {
        // creating input frame 
        Frame input_frame = new Frame("student data");
        input_frame.setLayout(null);
        input_frame.setSize(1600,900);
        input_frame.setBackground(Color.white);
        
        // textbox and radiobuttons initialization
        TextField TF_name,TF_father,TF_nationality,TF_religion,TF_caste,TF_DOB,TF_DOAdmit,TF_DOLeaving,TF_course,TF_pin,TF_DOIssuingTC,TF_year,TF_TCno,TF_admitno;

        CheckboxGroup ispromoted = new CheckboxGroup();
        CheckboxGroup ispaid = new CheckboxGroup();
        CheckboxGroup isapplied = new CheckboxGroup();
        // setting auto close operation to input frame
        input_frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                ((Frame)e.getSource()).dispose();
            }
        });

        // labels with text boxes/radio buttons for data input
        Label heading = new Label("ENTER YOUR DETAILS TO GENERATE TC(Transfer Certificate)");
        heading.setBounds(350,40,850,40);
        heading.setFont(new Font("Calibiri",Font.BOLD,28));

        Label TC_no = new Label("Enter the Certificate Number",Label.LEFT);
        TC_no.setBounds(50,90,320,30);
        TC_no.setFont(new Font("Arial",Font.PLAIN,24));
        TF_TCno = new TextField();
        TF_TCno.setBounds(450,90, 320,30);

        Label admit_no = new Label("Enter Admission Number",Label.LEFT);
        admit_no.setBounds(50,130,300,30);
        admit_no.setFont(new Font("Arial",Font.PLAIN,24));
        TF_admitno = new TextField();
        TF_admitno.setBounds(450,130, 320,30);

        Label name = new Label("Enter your Fullname",Label.LEFT);
        name.setBounds(50,170,250,30);
        name.setFont(new Font("Arial",Font.PLAIN,24));
        TF_name = new TextField();
        TF_name.setBounds(450,170, 320,30);

        Label father = new Label("Enter your Father Full Name ",Label.LEFT);
        father.setBounds(50,210,310,30);
        father.setFont(new Font("Arial",Font.PLAIN,24));
        TF_father=new TextField();
        TF_father.setBounds(450,210, 320,30);

        Label nationality = new Label("Enter your Nationality ",Label.LEFT);
        nationality.setBounds(50,250,250,30);
        nationality.setFont(new Font("Arial",Font.PLAIN,24));
        TF_nationality=new TextField();
        TF_nationality.setBounds(450,250, 320,30);

        Label religion  = new Label("Enter your Religion",Label.LEFT);
        religion .setBounds(50,290,230,30);
        religion.setFont(new Font("Arial",Font.PLAIN,24));
        TF_religion=new TextField();
        TF_religion.setBounds(450,290, 320,30);

        Label caste = new Label("Enter your Caste ",Label.LEFT);
        caste.setBounds(50,330,230,30);
        caste.setFont(new Font("Arial",Font.PLAIN,24));
        TF_caste=new TextField();
        TF_caste.setBounds(450,330, 320,30);

        Label DOB = new Label("Enter your Date of Birth ",Label.LEFT);
        DOB.setBounds(50,370,270,30);
        DOB.setFont(new Font("Arial",Font.PLAIN,24));
        TF_DOB=new TextField();
        TF_DOB.setBounds(450,370, 320,30);
    
        Label DOAdmit= new Label("Enter your Date of Admission ",Label.LEFT);
        DOAdmit.setBounds(50,410,320,30);
        DOAdmit.setFont(new Font("Arial",Font.PLAIN,24));
        TF_DOAdmit=new TextField();
        TF_DOAdmit.setBounds(450,410, 320,30);
    
        Label DOLeaving = new Label("Enter your Date of Leaving ",Label.LEFT);
        DOLeaving.setBounds(50,450,295,30);
        DOLeaving.setFont(new Font("Arial",Font.PLAIN,24));
        TF_DOLeaving=new TextField();
        TF_DOLeaving.setBounds(450,450, 320,30);

        Label year = new Label("Enter year/sem at the time of leaving ",Label.LEFT);
        year.setBounds(50,490,400,30);
        year.setFont(new Font("Arial",Font.PLAIN,24));
        TF_year=new TextField();
        TF_year.setBounds(450,490, 320,30);

        Label course= new Label("Enter your Course ",Label.LEFT);
        course.setBounds(50,530,210,30);
        course.setFont(new Font("Arial",Font.PLAIN,24));
        TF_course=new TextField();
        TF_course.setBounds(450,530, 320,30);
    
        Label pin = new Label("Enter your Pin ",Label.LEFT);
        pin.setBounds(50,570,200,30);
        pin.setFont(new Font("Arial",Font.PLAIN,24));
        TF_pin=new TextField();
        TF_pin.setBounds(450,570, 320,30);
    
        Label promotion_status = new Label("Are you promoted to higher class ? ",Label.LEFT);
        promotion_status .setBounds(50,610,380,30);
        promotion_status.setFont(new Font("Arial",Font.PLAIN,24));
        
        Checkbox yes_promoted = new Checkbox("YES",ispromoted,false);
        yes_promoted.setBounds(450, 610, 50, 30);
        Checkbox not_promoted = new Checkbox("NO",ispromoted,false);
        not_promoted.setBounds(620, 610, 50, 30);

        Label fee_status = new Label("Have you paid all College Fee ? ",Label.LEFT);
        fee_status.setBounds(50,650,350,30);
        fee_status.setFont(new Font("Arial",Font.PLAIN,24));

        Checkbox yes_paid = new Checkbox("YES",ispaid,false);
        yes_paid.setBounds(450, 650, 50, 30);
        Checkbox not_paid = new Checkbox("NO",ispaid,false);
        not_paid.setBounds(620, 650, 50, 30);

        Label applied= new Label("Whether you have applied for this ",Label.LEFT);
        applied.setBounds(50,690,650,30);
        applied.setFont(new Font("Arial",Font.PLAIN,24));
        Label sumoto= new Label("certificate or it is being given sumoto",Label.LEFT);
        sumoto.setBounds(50,730,650,30);
        sumoto.setFont(new Font("Arial",Font.PLAIN,24));

        Checkbox yes_applied = new Checkbox("YES",isapplied,false);
        yes_applied.setBounds(450, 710, 50, 30);
        Checkbox not_applied = new Checkbox("NO",isapplied,false);
        not_applied.setBounds(620, 710, 50, 30);
        
        Label DOIssuing_TC = new Label("Date of issuing Transfer Certificate ",Label.LEFT);
        DOIssuing_TC.setBounds(50,770,390,30);
        DOIssuing_TC.setFont(new Font("Arial",Font.PLAIN,24));
        TF_DOIssuingTC=new TextField();
        TF_DOIssuingTC.setBounds(450,770,320,30);

        // creating submit button to generate TC
        Button submit = new Button("SUBMIT");
        submit.setBounds(1030,770,100,40);
        submit.setBounds(1030,770,100,40);
        submit.setFont(new Font("Arial",Font.PLAIN,20));
        
        // adding labels,textboxes,radio buttons to input frame
        input_frame.add(heading);
        input_frame.add(TC_no);
        input_frame.add(TF_TCno);
        input_frame.add(admit_no);
        input_frame.add(TF_admitno);
        input_frame.add(name);
        input_frame.add(TF_name);
        input_frame.add(father);
        input_frame.add(TF_father);
        input_frame.add(nationality);
        input_frame.add(TF_nationality);
        input_frame.add(religion);
        input_frame.add(TF_religion);
        input_frame.add(caste);
        input_frame.add(TF_caste);
        input_frame.add(DOB);
        input_frame.add(TF_DOB);
        input_frame.add(DOAdmit);
        input_frame.add(TF_DOAdmit);
        input_frame.add(DOLeaving);
        input_frame.add(TF_DOLeaving);
        input_frame.add(year);
        input_frame.add(TF_year);
        input_frame.add(course);
        input_frame.add(TF_course);
        input_frame.add(pin);
        input_frame.add(TF_pin);
        input_frame.add(promotion_status);
        input_frame.add(yes_promoted);
        input_frame.add(not_promoted);
        input_frame.add(fee_status);
        input_frame.add(yes_paid);
        input_frame.add(not_paid);
        input_frame.add(applied);
        input_frame.add(sumoto);
        input_frame.add(yes_applied);
        input_frame.add(not_applied);
        input_frame.add(DOIssuing_TC);
        input_frame.add(TF_DOIssuingTC);

        //generating tc on new frame on button click

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // getting text from text boxes
                String admitno_input = TF_admitno.getText();
                String TCno_input = TF_TCno.getText();
                String name_input = TF_name.getText();
                String father_input = TF_father.getText();
                String nationality_input = TF_nationality.getText();
                String religion_inpuString = TF_religion.getText();
                String caste_input = TF_caste.getText();
                String DOB_input = TF_DOB.getText();
                String DOAdmit_input = TF_DOAdmit.getText();
                String DOLeaving_input = TF_DOLeaving.getText();
                String course_input = TF_course.getText();
                String pin_input = TF_pin.getText();
                String DOIssuingTC_input = TF_DOIssuingTC.getText();
                String year_input = TF_year.getText();

                // getting text from radio buttons
                String result_of_ispromoted = ispromoted.getSelectedCheckbox().getLabel();
                String result_of_ispaid = ispaid.getSelectedCheckbox().getLabel();
                String result_of_isapplied = isapplied.getSelectedCheckbox().getLabel();
        
        // creation of TC frame
        Frame display_frame = new Frame("Real TC");
        // setting auto close operation for TC frame 

        display_frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                ((Frame)e.getSource()).dispose();
            }
        });

        // creating labels on TC

        Label header = new Label("GOVERNMENT POLYTECHNIC - KALYANDURG-515 761 ");
        header.setBounds(30,50,1000,30);
        header.setFont(new Font("Calibiri",Font.BOLD,28));
        
        Label L_original = new Label("ORIGINAL");
        L_original.setBounds(30,90,160,30);
        L_original.setFont(new Font("Arial",Font.BOLD,20));

        Label L_TC = new Label("TRANSFER CERTIFICATE");
        L_TC.setBounds(250,110,360,30);
        L_TC.setFont(new Font("Calibiri",Font.BOLD,26));

        Label L_no = new Label(".No.");
        L_no.setBounds(30, 160, 50, 30);
        L_no.setFont(new Font("Calibiri", Font.BOLD, 20));

        Label display_TCno = new Label(TCno_input);
        display_TCno.setBounds(120, 160, 100, 30);
        display_TCno.setFont(new Font("Arial", Font.PLAIN, 20));

        Label L_Admitno = new Label("Admn.No. :");
        L_Admitno.setBounds(330, 150, 60, 30);
        L_Admitno.setFont(new Font("Calibiri", Font.BOLD, 20));
        
        Label display_admitno = new Label(admitno_input);
        display_admitno.setBounds(410, 150, 200, 30);
        display_admitno.setFont(new Font("Arial", Font.PLAIN, 20));
        
        JLabel L_name_father = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>1.    Name of the student Full with : <br>       father's name </pre></html>");
        L_name_father.setBounds(35,180,330,60);

        Label display_name = new Label(name_input );
        display_name.setBounds(430, 180, 600, 30);
        display_name.setFont(new Font("Arial", Font.PLAIN, 18));

        Label display_father = new Label( father_input);
        display_father.setBounds(430, 208, 600, 33);
        display_father.setFont(new Font("Arial", Font.PLAIN, 18));


        JLabel L_nation_relig_caste = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>2.    Nationality,Religion & Caste  :</pre></html>");
        L_nation_relig_caste.setBounds(35,235,350,30);
        L_nation_relig_caste.setFont(new Font("Arial",Font.BOLD,20));

        Label display_nation_relig_caste = new Label(nationality_input+"-"+religion_inpuString+"-"+caste_input);
        display_nation_relig_caste.setBounds(430, 240, 400, 30);
        display_nation_relig_caste.setFont(new Font("Arial", Font.PLAIN,18 ));

        JLabel L_DOB = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>3.    Date of Birth as entered in the <br>       Admission Register :</pre></html>");
        L_DOB.setBounds(35,260,330,60);
        L_DOB.setFont(new Font("Arial",Font.PLAIN,20));

        String DOBinwords ="";
        for (int i = 0; i < DOB_input.length(); i++) {
            if (i==2|i==5) {
                DOBinwords += "-";
            } else {
                switch (DOB_input.charAt(i)) {
                    case '0':
                        DOBinwords += " zero ";
                        break;
                    case '1':
                        DOBinwords += " one ";
                        break;
                    case '2':
                        DOBinwords += " two ";
                        break;
                    case '3':
                        DOBinwords += " three ";
                        break;
                    case '4':
                        DOBinwords += " four ";
                        break;
                    case '5':
                        DOBinwords += " five ";
                        break;
                    case '6':
                        DOBinwords += " six ";
                        break;
                    case '7':
                        DOBinwords += " seven ";
                        break;
                    case '8':
                        DOBinwords += " eight ";
                        break;
                    case '9':
                        DOBinwords += " nine ";
                        break;
                
                    default:
                        break;
                }
            }
            }

        Label display_DOB = new Label(DOB_input);
        display_DOB.setBounds(430, 265, 800, 30);
        display_DOB.setFont(new Font("Arial", Font.PLAIN, 18));

        Label display_DOBinwords = new Label("("+DOBinwords+")");
        display_DOBinwords.setBounds(430, 290, 800, 30);
        display_DOBinwords.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel L_DOAdmit = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>4.    Date of Admission :</pre></html>");
        L_DOAdmit.setBounds(35,315,240,30);
        L_DOAdmit.setFont(new Font("Arial",Font.PLAIN,20));

        Label display_DOAdmit = new Label(DOAdmit_input);
        display_DOAdmit.setBounds(430, 315, 200, 30);
        display_DOAdmit.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel L_DOLeaving1 = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>5.    Date of Leaving :</pre></html>");
        L_DOLeaving1.setBounds(35,340,200,30);
        L_DOLeaving1.setFont(new Font("Arial",Font.PLAIN,20));

        Label display_DOLeaving1 = new Label(DOLeaving_input);
        display_DOLeaving1.setBounds(430, 345, 200, 30);
        display_DOLeaving1.setFont(new Font("Arial", Font.PLAIN, 18));
        
        JLabel L_year_course = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500'>6.    Course/ Class and Pin No.in which<br>       the student was studying at the time<br>       of leaving :</pre></html>");
        L_year_course.setBounds(35,365,400,80);
        L_year_course.setFont(new Font("Arial",Font.BOLD,20));

        JLabel display_year_course = new JLabel(year_input+"-"+course_input+",");
        display_year_course.setBounds(430, 370, 200, 30);
        display_year_course.setFont(new Font("Arial", Font.PLAIN, 18));
        JLabel display_pin = new JLabel(pin_input);
        display_pin.setBounds(430, 400, 200, 30);
        display_pin.setFont(new Font("Arial", Font.PLAIN, 18));
        
        JLabel L_promotion = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>7.    Whether Qualified for Promotion<br>       to the higher class :</pre></html>");
        L_promotion.setBounds(35,440,380,60);
        L_promotion.setFont(new Font("Arial",Font.PLAIN,20));

        JLabel display_result_of_ispromoted = new JLabel(result_of_ispromoted);
        display_result_of_ispromoted.setBounds(430, 460, 200, 30);
        display_result_of_ispromoted.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel L_fee = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>8.    Whether all fees due to the<br>       College have been paid :</pre></html>");
        L_fee.setBounds(35,490,440,60);
        L_fee.setFont(new Font("Arial",Font.PLAIN,60));

        JLabel display_result_of_ispaid = new JLabel(result_of_ispaid);
        display_result_of_ispaid.setBounds(430, 505, 200, 30);
        display_result_of_ispaid.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel L_DOLeaving2 = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>9.    Date on which the pupil actually<br>       left the College :</pre></html>");
        L_DOLeaving2.setBounds(35,535,385,60);
        L_DOLeaving2.setFont(new Font("Arial",Font.PLAIN,20));

        Label display_DOLeaving2 = new Label(DOLeaving_input);
        display_DOLeaving2.setBounds(430, 545, 200, 30);
        display_DOLeaving2.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel L_progress = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>10.  Conduct & Progress of the Student :</pre></html>");
        L_progress.setBounds(35,585,960,30);
        L_progress.setFont(new Font("Arial",Font.PLAIN,20));

        JLabel L_applied_sumoto = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>11.  Whether the Student has applied<br>       for this certificate or it is being<br>       given sumoto :</pre></html>");
        L_applied_sumoto.setBounds(35,615,400,80);
        L_applied_sumoto.setFont(new Font("Arial",Font.PLAIN,80));

        JLabel display_applied_sumoto = new JLabel(result_of_isapplied);
        display_applied_sumoto.setBounds(430, 645, 200, 30);
        display_applied_sumoto.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel L_DOIssuingTC = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ;>12.  Date of Issuing Transfer Certificate :</pre></html>");
        L_DOIssuingTC.setBounds(35,690,400,30);
        L_DOIssuingTC.setFont(new Font("Arial",Font.PLAIN,20));

        Label display_DOIssuingTC = new Label(DOIssuingTC_input);
        display_DOIssuingTC.setBounds(430, 690, 200, 30);
        display_DOIssuingTC.setFont(new Font("Arial", Font.PLAIN, 18));

        Label L_Date = new Label("Date : ");
        L_Date.setBounds(40,740,100,30);
        L_Date.setFont(new Font("Arial",Font.BOLD,20));

        Label L_seal = new Label("Office Seal : ");
        L_seal.setBounds(40,775,150,30);
        L_seal.setFont(new Font("Arial",Font.BOLD,20));

        JLabel L_principal = new JLabel("<html><pre style ='font-family:Arial;font-size:15px;font-weight:500' ; >                   PRINCIPAL                  </pre></html>");
        L_principal.setBounds(400,740,320,40);
        
        //adding the labels,inputed text to TC frame

        display_frame.add(header);
        display_frame.add(L_original);
        display_frame.add(L_TC);
        display_frame.add(L_no);
        display_frame.add(display_TCno);
        display_frame.add(L_Admitno);
        display_frame.add(display_admitno);
        display_frame.add(L_name_father);
        display_frame.add(display_name);
        display_frame.add(display_father);
        display_frame.add(L_nation_relig_caste);
        display_frame.add(display_nation_relig_caste);
        display_frame.add(L_DOB);
        display_frame.add(display_DOB);
        display_frame.add(display_DOBinwords);
        display_frame.add(L_DOAdmit);
        display_frame.add(display_DOAdmit);
        display_frame.add(L_DOLeaving1);
        display_frame.add(display_DOLeaving1);
        display_frame.add(L_year_course);
        display_frame.add(display_year_course);
        display_frame.add(display_pin);
        display_frame.add(L_promotion);
        display_frame.add(display_result_of_ispromoted);
        display_frame.add(L_fee);
        display_frame.add(display_result_of_ispaid);
        display_frame.add(L_DOLeaving2);
        display_frame.add(display_DOLeaving2);
        display_frame.add(L_progress);
        display_frame.add(L_applied_sumoto);
        display_frame.add(display_applied_sumoto);
        display_frame.add(L_DOIssuingTC);
        display_frame.add(display_DOIssuingTC);
        display_frame.add(L_Date);
        display_frame.add(L_seal);
        display_frame.add(L_principal);
        //setting layout of TC frame
        display_frame.setLayout(null);
        display_frame.setSize(800,840);
        display_frame.setLocation(350, 0);
        display_frame.setVisible(true);

        }
    });
    input_frame.add(submit);
    input_frame.setVisible(true);
    }

}

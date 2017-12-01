package com.smvitm.rajath.smvitm;

/**
 * Created by rajat on 04-08-2017.
 */

public class SubjectInformationDisplay {
    public static String SubjectInfo(String branch, String year, String section, String sub, int tb) {
        if (year.equalsIgnoreCase("1st year")) {
            switch (section){
                case "A": if (sub.equalsIgnoreCase("PHYL/WSL"))
                {
                    switch (tb){
                        case 0 :return "PHYL / WSL";                 //name

                        case 1 :return "MON : 09:00 - 12:05(LAB)\n\nWED : 01:55 - 04:45(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("KAN"))
                {
                    switch (tb){
                        case 0 :return "Kannada Kali";                 //name

                        case 1 :return "MON : 12:05 - 01:00(206)";                 //tb1

                        case 2 :return "";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 03:55 - 04:45(101)\n\nTUE : 12:05 - 01:00(101)\n\nWED : 11:10 - 12:05(101)\n\nTHU : 09:00 - 09:55(101)\n\nTHU : 03:00 - 03:55(101)\n\nFRI : 01:55 - 02:50(101)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PHY"))
                {
                    switch (tb){
                        case 0 :return "Engg. Physics";                 //name

                        case 1 :return "TUE : 09:55 - 10:50(101)\n\nTUE : 03:55 - 04:45(101)\n\nWED : 09:00 - 09:55(101)\n\nTHU : 01:55 - 02:50(101)\n\nFRI : 12:05 - 01:00(101)";                 //tb1

                        case 2 :return "Subject Code : 15PHY12/15PHY22\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S083RVhTMDZYWXc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CIV"))
                {
                    switch (tb){
                        case 0 :return "Elements of Civil Engg.";                 //name

                        case 1 :return "MON : 03:00 - 03:55(101)\n\nTUE : 01:55 - 02:50(101)\n\nWED : 12:05 - 01:00(101)\n\nTHU : 09:55 - 10:50(101)\n\nFRI : 09:00 - 09:55(101)";                 //tb1

                        case 2 :return "Subject Code : 15CIV13/23\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXlqajJnWjZhQUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EME"))
                {
                    switch (tb){
                        case 0 :return "Elements of Mechanical Engg";                 //name

                        case 1 :return "MON : 01:55 - 02:50(101)\n\nTUE : 11:10 - 12:05(101)\n\nTHU : 12:05 - 01:00(101)\n\nFRI : 09:55 - 10:50(101)\n\nFRI : 03:55 - 04:45(101)";                 //tb1

                        case 2 :return "Subject Code : 15EME14/15EME24\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Z2FieEdFX190RWc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELE"))
                {
                    switch (tb){
                        case 0 :return "Elements of Electrical Engg.";                 //name

                        case 1 :return "TUE : 09:00 - 09:55(101)\n\nTUE : 03:00 - 03:55(101)\n\nWED : 09:55 - 10:50(101)\n\nTHU : 03:55 - 04:45(101)\n\nFRI : 11:10 - 12:05(101)";

                        case 2 :return "Subject Code : 15ELE15/15ELE25\n\nCredits : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7OFBzWktrR0c1S3M";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPH"))
                {
                    switch (tb){
                        case 0 :return "Constitution of India, Professional Ethics& Human Rights";                 //name

                        case 1 :return "THU : 11:10 - 12:05(101)\n\nFRI : 03:00 - 03:55(101)";                 //tb1

                        case 2 :return "Subject Code : 15CPH18/15CPH28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Tmx0Q1U5T1RHT28";                 //tb3

                        default:return "Data not available";
                    }

                }




                case "B": if (sub.equalsIgnoreCase("PHYL/WSL"))
                {
                    switch (tb){
                        case 0 :return "PHYL / WSL";                 //name

                        case 1 :return "TUE : 09:00 - 12:05(LAB)\n\nTHU : 01:55 - 04:45(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("KAN"))
                {
                    switch (tb){
                        case 0 :return "Kannada Kali";                 //name

                        case 1 :return "TUE : 12:05 - 01:00(102)\n\n ";                 //tb1

                        case 2 :return "";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 09:55 - 10:50(102)\n\nMON : 01:55 - 02:50(102)\n\nTUE : 03:55 - 04:45(102)\n\nWED : 01:55 - 02:50(102)\n\nTHU : 09:00 - 09:55(102)\n\nFRI : 11:10 - 12:05(102)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PHY"))
                {
                    switch (tb){
                        case 0 :return "Engg. Physics";                 //name

                        case 1 :return "MON : 12:05 - 01:00(102)\n\nTUE : 03:00 - 03:55(102)\n\nWED : 09:55 - 10:50(102)\n\nFRI : 09:00 - 09:55(102)\n\nFRI : 01:55 - 02:50(102)";                 //tb1

                        case 2 :return "Subject Code : 15PHY12/15PHY22\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S083RVhTMDZYWXc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CIV"))
                {
                    switch (tb){
                        case 0 :return "Elements of Civil Engg.";                 //name

                        case 1 :return "MON : 11:10 - 12:05(102)\n\nMON : 03:55 - 04:45(102)\n\nWED : 12:05 - 01:00(102)\n\nTHU : 12:05 - 01:00(102)\n\nFRI : 03:00 - 03:55(102)";                 //tb1

                        case 2 :return "Subject Code : 15CIV13/23\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXlqajJnWjZhQUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EME"))
                {
                    switch (tb){
                        case 0 :return "Elements of Mechanical Engg";                 //name

                        case 1 :return "TUE : 01:55 - 02:50(102)\n\nWED : 09:00 - 09:55(102)\n\nWED : 03:55 - 04:45(102)\n\nTHU : 11:10 - 12:05(102)\n\nFRI : 09:55 - 10:50(102)";                 //tb1

                        case 2 :return "Subject Code : 15EME14/15EME24\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Z2FieEdFX190RWc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELE"))
                {
                    switch (tb){
                        case 0 :return "Elements of Electrical Engg.";                 //name

                        case 1 :return "MON : 09:00 - 09:55(102)\n\nMON : 03:00 - 03:55(102)\n\nWED : 11:10 - 12:05(102)\n\nTHU : 09:55 - 10:50(102)\n\nFRI : 03:55 - 04:45(102)";                 //tb1

                        case 2 :return "Subject Code : 15ELE15/15ELE25\n\nCredits : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7OFBzWktrR0c1S3M";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPH"))
                {
                    switch (tb){
                        case 0 :return "Constitution of India, Professional Ethics& Human Rights";                 //name

                        case 1 :return "WED : 03:00 - 03:55(102)\n\nFRI : 12:05 - 01:00(102)";                 //tb1

                        case 2 :return "Subject Code : 15CPH18/15CPH28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Tmx0Q1U5T1RHT28";                 //tb3

                        default:return "Data not available";
                    }

                }





                case "C": if (sub.equalsIgnoreCase("PHYL/WSL"))
                {
                    switch (tb){
                        case 0 :return "PHYL / WSL";                 //name

                        case 1 :return "MON : 01:55 - 04:45(LAB)\n\nFRI : 01:55 - 04:45(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("KAN"))
                {
                    switch (tb){
                        case 0 :return "Kannada Kali";                 //name

                        case 1 :return "TUE : 03:55 - 04:45(103)";                 //tb1

                        case 2 :return "";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 09:00 - 09:55(103)\n\nTUE : 01:55 - 02:50(103)\n\nWED : 11:10 - 12:05(103)\n\nTHU : 09:55 - 10:50(103)\n\nTHU : 03:00 - 03:55(103)\n\nFRI : 09:55 - 10:50(103)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PHY"))
                {
                    switch (tb){
                        case 0 :return "Engg. Physics";                 //name

                        case 1 :return "TUE : 12:05 - 01:00(103)\n\nWED : 03:00 - 03:55(103)\n\nTHU : 09:00 - 09:55(103)\n\nTHU : 11:10 - 12:05(103)\n\nFRI : 12:05 - 01:00(103)";                 //tb1

                        case 2 :return "Subject Code : 15PHY12/15PHY22\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S083RVhTMDZYWXc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CIV"))
                {
                    switch (tb){
                        case 0 :return "Elements of Civil Engg.";                 //name

                        case 1 :return "MON : 09:55 - 10:50(103)\n\nTUE : 11:10 - 12:05(103)\n\nWED : 12:05 - 01:00(103)\n\nWED : 03:55 - 04:45(103)\n\nFRI : 09:00 - 09:55(103)";                 //tb1

                        case 2 :return "Subject Code : 15CIV13/23\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXlqajJnWjZhQUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EME"))
                {
                    switch (tb){
                        case 0 :return "Elements of Mechanical Engg";                 //name

                        case 1 :return "MON : 11:10 - 12:05(103)\n\nTUE : 09:55 - 10:50(103)\n\nTUE : 03:00 - 03:55(103)\n\nWED : 09:00 - 09:55(103)\n\nTHU : 01:55 - 02:50(103)";                 //tb1

                        case 2 :return "Subject Code : 15EME14/15EME24\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Z2FieEdFX190RWc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELE"))
                {
                    switch (tb){
                        case 0 :return "Elements of Electrical Engg.";                 //name

                        case 1 :return "MON : 12:05 - 01:00(103)\n\nTUE : 09:00 - 09:55(103)\n\nWED : 09:55 - 10:50(103)\n\nTHU : 03:55 - 04:45(103)\n\nFRI : 11:10 - 12:05(103)";                 //tb1

                        case 2 :return "Subject Code : 15ELE15/15ELE25\n\nCredits : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7OFBzWktrR0c1S3M";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPH"))
                {
                    switch (tb){
                        case 0 :return "Constitution of India, Professional Ethics& Human Rights";                 //name

                        case 1 :return "WED : 01:55 - 02:50(103)\n\nTHU : 12:05 - 01:00(103)";                 //tb1

                        case 2 :return "Subject Code : 15CPH18/15CPH28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Tmx0Q1U5T1RHT28";                 //tb3

                        default:return "Data not available";
                    }

                }


                case "D": if (sub.equalsIgnoreCase("PHYL/WSL"))
                {
                    switch (tb){
                        case 0 :return "PHYL / WSL";                 //name

                        case 1 :return "TUE : 01:55 - 04:45(LAB)\n\nFRI : 09:00 - 12:05(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("KAN"))
                {
                    switch (tb){
                        case 0 :return "Kannada Kali";                 //name

                        case 1 :return "FRI : 12:05 - 01:00(SH)";                 //tb1

                        case 2 :return "";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 01:55 - 02:50(104)\n\nTUE : 09:00 - 09:55(104)\n\nWED : 09:55 - 10:50(104)\n\nWED : 01:55 - 02:50(104)\n\nTHU : 12:05 - 01:00(104)\n\nFRI : 03:00 - 03:55(104)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PHY"))
                {
                    switch (tb){
                        case 0 :return "Engg. Physics";                 //name

                        case 1 :return "MON : 09:55 - 10:50(104)\n\nMON : 03:55 - 04:45(104)\n\nTUE : 11:10 - 12:05(104)\n\nWED : 09:00 - 09:55(104)\n\nTHU : 01:55 - 02:50(104)";                 //tb1

                        case 2 :return "Subject Code : 15PHY12/15PHY22\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S083RVhTMDZYWXc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CIV"))
                {
                    switch (tb){
                        case 0 :return "Elements of Civil Engg.";                 //name

                        case 1 :return "MON : 12:05 - 01:00(104)\n\nTUE : 09:55 - 10:50(104)\n\nWED : 03:55 - 04:45(104)\n\nTHU : 11:10 - 12:05(104)\n\nFRI : 01:55 - 02:50(104)";                 //tb1

                        case 2 :return "Subject Code : 15CIV13/23\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXlqajJnWjZhQUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EME"))
                {
                    switch (tb){
                        case 0 :return "Elements of Mechanical Engg";                 //name

                        case 1 :return "MON : 11:10 - 12:05(104)\n\nTUE : 12:05 - 01:00(104)\n\nWED : 03:00 - 03:55(104)\n\nTHU : 09:00 - 09:55(104)\n\nTHU : 03:55 - 04:45(104)";                 //tb1

                        case 2 :return "Subject Code : 15EME14/15EME24\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 04 ";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Z2FieEdFX190RWc";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELE"))
                {
                    switch (tb){
                        case 0 :return "Elements of Electrical Engg.";                 //name

                        case 1 :return "MON : 09:00 - 09:55(104)\n\nMON : 03:00 - 03:55(104)\n\nWED : 11:10 - 12:05(104)\n\nTHU : 09:55 - 10:50(104)\n\nFRI : 03:55 - 04:45(104)";                 //tb1

                        case 2 :return "Subject Code : 15ELE15/15ELE25\n\nCredits : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7OFBzWktrR0c1S3M";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPH"))
                {
                    switch (tb){
                        case 0 :return "Constitution of India, Professional Ethics& Human Rights";                 //name

                        case 1 :return "WED : 12:05 - 01:00(104)\n\nTHU : 03:00 - 03:55(104)";                 //tb1

                        case 2 :return "Subject Code : 15CPH18/15CPH28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Tmx0Q1U5T1RHT28";                 //tb3

                        default:return "Data not available";
                    }

                }

                case "E":if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 01:55 - 02:50(105)\n\nTUE : 01:55 - 02:50(105)\n\nWED : 11:10 - 12:05(105)\n\nWED : 03:55 - 04:45(105)\n\nTHU : 12:05 - 01:00(105)\n\nFRI : 09:00 - 09:55(105)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CHE"))
                {
                    switch (tb){
                        case 0 :return "Engg. Chemistry";                 //name

                        case 1 :return "MON : 03:00 - 03:55(105)\n\nWED : 09:00 - 09:55(105)\n\nWED : 01:55 - 02:50(105)\n\nTHU : 09:55 - 10:50(105)\n\nFRI : 11:10 - 12:05(105)";                 //tb1

                        case 2 :return "Subject Code : 15CHE12/15CHE22\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Qk5WQjJfS3VhUTA";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PCD"))
                {
                    switch (tb){
                        case 0 :return "Programming in C & Data Structure";                 //name

                        case 1 :return "TUE : 03:55 - 04:45(105)\n\nWED : 09:55 - 10:50(105)\n\nTHU : 11:10 - 12:05(105)\n\nFRI : 09:55 - 10:50(105)";                 //tb1

                        case 2 :return "Subject Code : 15PCD13/23\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eFVQb0R3aWpoYUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CAED"))
                {
                    switch (tb){
                        case 0 :return "Computer Aided Engg. Drawing";                 //name

                        case 1 :return "MON : 09:00 - 09:55(206)\n\nMON : 09:55 - 10:50(206)\n\nMON : 11:10 - 12:05(206)\n\nMON : 12:05 - 01:00(206)\n\nTHU : 01:55 - 02:50(206)\n\nTHU : 03:00 - 03:55(206)\n\nTHU : 03:55 - 04:45(206)";                 //tb1

                        case 2 :return "Subject Code : 15CED14/15CED24\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 6 (2T + 4L)\n\nTotal Number of Lecture Hours :84\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UmhWVGRRQTFVUWM";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELN"))
                {
                    switch (tb){
                        case 0 :return "Basic Electronics";                 //name

                        case 1 :return "MON : 03:55 - 04:45(105)\n\nTUE : 03:00 - 03:55(105)\n\nWED : 12:05 - 01:00(105)\n\nTHU : 09:00 - 09:55(105)\n\nFRI : 12:05 - 01:00(105)";                 //tb1

                        case 2 :return "Subject Code : 15ELN15 / 15ELN25\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aEFPYy1QUTZnQWs";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPL/CHEL"))
                {
                    switch (tb){
                        case 0 :return "CPL / CHEL";                 //name

                        case 1 :return "TUE : 09:00 - 12:05(LAB)\n\nFRI : 01:55 - 04:45(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EVS"))
                {
                    switch (tb){
                        case 0 :return "Environmental Studies";                 //name

                        case 1 :return "TUE : 12:05 - 01:00(206)\n\nWED : 03:00 - 03:55(105)";                 //tb1

                        case 2 :return "Subject Code : 15CIV18/15CIV28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7M0NYYTNjb3kzZUU";                 //tb3

                        default:return "Data not available";
                    }

                }



                case "F":if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 12:05 - 01:00(101)\n\nTUE : 01:55 - 02:50(104)\n\nWED : 03:00 - 03:55(101)\n\nTHU : 09:00 - 09:55(206)\n\nTHU : 03:00 - 03:55(102)\n\nFRI : 09:55 - 10:50(104)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CHE"))
                {
                    switch (tb){
                        case 0 :return "Engg. Chemistry";                 //name

                        case 1 :return "MON : 09:00 - 09:55(101)\n\nWED : 01:55 - 02:50(101)\n\nTHU : 09:55 - 10:50(206)\n\nTHU : 01:55 - 02:50(102)\n\nFRI : 12:05 - 01:00(104)";                 //tb1

                        case 2 :return "Subject Code : 15CHE12/15CHE22\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Qk5WQjJfS3VhUTA";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PCD"))
                {
                    switch (tb){
                        case 0 :return "Programming in C & Data Structure";                 //name

                        case 1 :return "MON : 09:55 - 10:50(101)\n\nTHU : 11:10 - 12:05(206)\n\nTHU : 03:55 - 04:45(102)\n\nFRI : 11:10 - 12:05(104)";                 //tb1

                        case 2 :return "Subject Code : 15PCD13/23\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eFVQb0R3aWpoYUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CAED"))
                {
                    switch (tb){
                        case 0 :return "Computer Aided Engg. Drawing";                 //name

                        case 1 :return "TUE : 09:00 - 09:55(102)\n\nTUE : 09:55 - 10:50(102)\n\nTUE : 11:10 - 12:05(102)\n\nTUE : 12:05 - 01:00(102)\n\nFRI : 01:55 - 02:50(206)\n\nFRI : 03:00 - 03:55(206)\n\nFRI : 03:55 - 04:45(206)";                 //tb1

                        case 2 :return "Subject Code : 15CED14/15CED24\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 6 (2T + 4L)\n\nTotal Number of Lecture Hours :84\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UmhWVGRRQTFVUWM";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELN"))
                {
                    switch (tb){
                        case 0 :return "Basic Electronics";                 //name

                        case 1 :return "MON : 11:10 - 12:05(101)\n\nTUE : 03:00 - 03:55(104)\n\nWED : 03:55 - 04:45(101)\n\nTHU : 12:05 - 01:00(206)\n\nFRI : 09:00 - 09:55(104)";                 //tb1

                        case 2 :return "Subject Code : 15ELN15 / 15ELN25\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aEFPYy1QUTZnQWs";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPL/CHEL"))
                {
                    switch (tb){
                        case 0 :return "CPL / CHEL";                 //name

                        case 1 :return "MON : 01:55 - 04:45(LAB)\n\nWED : 09:00 - 12:05(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EVS"))
                {
                    switch (tb){
                        case 0 :return "Environmental Studies";                 //name

                        case 1 :return "TUE : 03:55 - 04:45(104)\n\nWED : 12:05 - 01:00(206)";                 //tb1

                        case 2 :return "Subject Code : 15CIV18/15CIV28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7M0NYYTNjb3kzZUU";                 //tb3

                        default:return "Data not available";
                    }

                }



                case "G":if (sub.equalsIgnoreCase("MAT"))
                {
                    switch (tb){
                        case 0 :return "Engg. Mathematics-I";                 //name

                        case 1 :return "MON : 09:55 - 10:50(105)\n\nTUE : 09:00 - 09:55(105)\n\nWED : 01:55 - 02:50(206)\n\nTHU : 03:00 - 03:55(105)\n\nFRI : 12:05 - 01:00(206)\n\nFRI : 03:55 - 04:45(105)";                 //tb1

                        case 2 :return "Subject Code : 15MAT11\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours :50\n\nIA Marks : 20\n\nExam Marks :80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cEN5LXZsTjRfWFk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CHE"))
                {
                    switch (tb){
                        case 0 :return "Engg. Chemistry";                 //name

                        case 1 :return "MON : 12:05 - 01:00(105)\n\nWED : 03:00 - 03:55(206)\n\nTHU : 03:55 - 04:45(105)\n\nFRI : 09:00 - 09:55(206)\n\nFRI : 11:10 - 12:05(206)";                 //tb1

                        case 2 :return "Subject Code : 15CHE12/15CHE22\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Qk5WQjJfS3VhUTA";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("PCD"))
                {
                    switch (tb){
                        case 0 :return "Programming in C & Data Structure";                 //name

                        case 1 :return "MON : 11:10 - 12:05(105)\n\nTUE : 12:05 - 01:00(105)\n\nTHU : 01:55 - 02:50(105)\n\nFRI : 09:55 - 10:50(206)";                 //tb1

                        case 2 :return "Subject Code : 15PCD13/23\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eFVQb0R3aWpoYUk";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CAED"))
                {
                    switch (tb){
                        case 0 :return "Computer Aided Engg. Drawing";                 //name

                        case 1 :return "MON : 01:55 - 02:50(206)\n\nMON : 03:00 - 03:55(206)\n\nMON : 03:55 - 04:45(206)\n\nWED : 09:00 - 09:55(206)\n\nWED : 09:55 - 10:50(206)\n\nWED : 11:10 - 12:05(206)\n\nWED : 12:05 - 01:00(206)";                 //tb1

                        case 2 :return "Subject Code : 15CED14/15CED24\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 6 (2T + 4L)\n\nTotal Number of Lecture Hours :84\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UmhWVGRRQTFVUWM";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("ELN"))
                {
                    switch (tb){
                        case 0 :return "Basic Electronics";                 //name

                        case 1 :return "MON : 09:00 - 09:55(105)\n\nTUE : 09:55 - 10:50(105)\n\nWED : 03:55 - 04:45(206)\n\nTHU : 12:05 - 01:00(EC012)\n\nFRI : 01:55 - 02:50(105)";                 //tb1

                        case 2 :return "Subject Code : 15ELN15 / 15ELN25\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aEFPYy1QUTZnQWs";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("CPL/CHEL"))
                {
                    switch (tb){
                        case 0 :return "CPL / CHEL";                 //name

                        case 1 :return "TUE : 01:55 - 04:45(LAB)\n\nTHU : 09:00 - 12:05(LAB)";                 //tb1

                        case 2 :return "CREDITS : 02\n\nLabs / Tutorial Hours/Week : 3 (1 hr Tut +2 hrs lab)\n\nTotal Number of Lecture Hours :42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                        case 3 :return "";                 //tb3

                        default:return "Data not available";
                    }

                }else if (sub.equalsIgnoreCase("EVS"))
                {
                    switch (tb){
                        case 0 :return "Environmental Studies";                 //name

                        case 1 :return "TUE : 11:10 - 12:05(105)\n\nFRI : 03:00 - 03:55(105)";                 //tb1

                        case 2 :return "Subject Code : 15CIV18/15CIV28\n\nNumber of Lecture Hours/Week : 02\n\nTotal Number of Lecture Hours : 25\n\nIA Marks : 10\n\nExam Marks : 40\n\nExam Hours : 02";                 //tb2

                        case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7M0NYYTNjb3kzZUU";                 //tb3

                        default:return "Data not available";
                    }

                }




                default:return "Data not available";
            }

        } else {


            if (branch.equalsIgnoreCase("Civil Engineering")) {
                if (year.equalsIgnoreCase("2nd year")) {
                    if (sub.equalsIgnoreCase("MAT"))
                    {
                        switch (tb){
                            case 0 :return "Engineering Mathematics - III";                 //name

                            case 1 :return "MON : 09:55 - 10:50(CV 101)\n\nTUE : 09:00 - 09:55(CV 101)\n\nWED : 01:55 - 02:50(CV 101)\n\nFRI : 12:05 - 01:00(CV 101)";                 //tb1

                            case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("SOM"))
                    {
                        switch (tb){
                            case 0 :return "Strength of Materials";                 //name

                            case 1 :return "TUE : 11:10 - 12:05(CV 101)\n\nWED : 09:00 - 09:55(CV 101)\n\nTHU : 01:55 - 02:50(CV 101)\n\nFRI : 09:55 - 10:50(CV 101)";                 //tb1

                            case 2 :return "Subject Code : 15CV32\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nI.A. Marks : 20\n\nExam. Marks : 80\n\nExam. Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7NVNhbm1OVUZUN1U";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("FM"))
                    {
                        switch (tb){
                            case 0 :return "Fluid Mechanics";                 //name

                            case 1 :return "TUE : 12:05 - 01:00(CV 101)\n\nWED : 12:05 - 01:00(CV 101)\n\nTHU : 12:05 - 01:00(CV 101)\n\nFRI : 03:00 - 03:55(CV 101)\n\nFRI : 03:55 - 04:45(CV 101)";                 //tb1

                            case 2 :return "Subject Code : 15CV33\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXBDanpQM3ZQNzQ";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("BS"))
                    {
                        switch (tb){
                            case 0 :return "Basic Surveying";                 //name

                            case 1 :return "MON : 12:05 - 01:00(CV 101)\n\nTUE : 09:55 - 10:50(CV 101)\n\nWED : 03:00 - 03:55(CV 101)\n\nWED : 03:55 - 04:45(CV 101)\n\nFRI : 09:00 - 09:55(CV 101)";                 //tb1

                            case 2 :return "Subject Code : 15CV34\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7bEpIU3IzSGZreWc";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("EG"))
                    {
                        switch (tb){
                            case 0 :return "Engineering Geology";                 //name

                            case 1 :return "MON : 11:10 - 12:05(CV 101)\n\nWED : 09:55 - 10:50(CV 101)\n\nTHU : 03:00 - 03:55(CV 101)\n\nFRI : 11:10 - 12:05(CV 101)";                 //tb1

                            case 2 :return "Subject Code :  15CV35\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7QVRIeVl5YXNldm8";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("BMC"))
                    {
                        switch (tb){
                            case 0 :return "Building Materials and Construction";                 //name

                            case 1 :return "MON : 09:00 - 09:55(CV 101)\n\nWED : 11:10 - 12:05(CV 101)\n\nTHU : 03:55 - 04:45(CV 101)\n\nFRI : 01:55 - 02:50(CV 101)";                 //tb1

                            case 2 :return "Subject Code : 15CV36\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam  Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Q1ZCMlk4dFJQTkU";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("BMT/BS LAB"))
                    {
                        switch (tb){
                            case 0 :return "BMT / BS LAB ";                 //name

                            case 1 :return "MON : 01:55 - 04:45(LAB)\n\nTUE : 01:55 - 04:45(LAB)\n\nTHU : 09:00 - 12:05(LAB)";                 //tb1

                            case 2 :return "";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }

                } else if (year.equalsIgnoreCase("3rd year")) {
                    if (sub.equalsIgnoreCase("DRCS"))
                    {
                        switch (tb){
                            case 0 :return "Design of RC Structural Elements";                 //name

                            case 1 :return "MON : 09:00 - 09:55(CV 201)\n\nWED : 09:00 - 09:55(CV 201)\n\nTHU : 03:00 - 03:55(CV 201)\n\nTHU : 03:55 - 04:45(CV 201)";                 //tb1

                            case 2 :return "Subject Code : 15CV51\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eDJpNTB5Mk1zczA";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("AIS"))
                    {
                        switch (tb){
                            case 0 :return "Analysis of Indeterminate Structures";                 //name

                            case 1 :return "MON : 09:55 - 10:50(CV 201)\n\nMON : 11:10 - 12:05(CV 201)\n\nWED : 09:55 - 10:50(CV 201)\n\nTHU : 01:55 - 02:50(CV 201)\n\nFRI : 12:05 - 01:00(CV 201)";                 //tb1

                            case 2 :return "Subject Code : 15CV52\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("AGE"))
                    {
                        switch (tb){
                            case 0 :return "Applied Geotechnical Engineering";                 //name

                            case 1 :return "MON : 01:55 - 02:50(CV 201)\n\nMON : 03:00 - 03:55(CV 201)\n\nTUE : 03:00 - 03:55(CV 201)\n\nWED : 11:10 - 12:05(CV 201)\n\nTHU : 12:05 - 01:00(CV 201)";                 //tb1

                            case 2 :return "Subject Code : 15CV53\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("CA BPD"))
                    {
                        switch (tb){
                            case 0 :return "Computer Aided Building Planning &Drawing";                 //name

                            case 1 :return "THU : 09:55 - 10:50(LAB)\n\nFRI : 01:55 - 02:50(LAB)\n\nFRI : 03:00 - 03:55(LAB)\n\nFRI : 03:55 - 04:45(LAB)";                 //tb1

                            case 2 :return "Subject Code : 15CV54\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture/Practice Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 04";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("APC"))
                    {
                        switch (tb){
                            case 0 :return "Air Pollution and Control";                 //name

                            case 1 :return "MON : 03:55 - 04:45(CV 201)\n\nTUE : 01:55 - 02:50(CV 201)\n\nWED : 12:05 - 01:00(CV 201)\n\nTHU : 09:00 - 09:55(CV 201)";                 //tb1

                            case 2 :return "Subject Code : 15CV551\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 03";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("SCE"))
                    {
                        switch (tb){
                            case 0 :return "Sustainability concepts in Engineering";                 //name

                            case 1 :return "MON : 12:05 - 01:00(CV 201)\n\nTUE : 12:05 - 01:00(CV 201)\n\nTUE : 03:55 - 04:45(CV 201)\n\nTHU : 11:10 - 12:05(CV 201)";                 //tb1

                            case 2 :return "Subject Code : 15CV562\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03\n\nCREDITS : 03";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("C&H/GTE LAB"))
                    {
                        switch (tb){
                            case 0 :return "C&H / GTE LAB";                 //name

                            case 1 :return "TUE : 09:00 - 12:05(LAB)\n\nWED : 01:55 - 04:45(LAB)\n\nFRI : 09:00 - 12:05(LAB)";                 //tb1

                            case 2 :return "";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }

                } else if (year.equalsIgnoreCase("4th year")) {
                    if (sub.equalsIgnoreCase("EE – II"))
                    {
                        switch (tb){
                            case 0 :return "Environmental Engineering – II";                 //name

                            case 1 :return "MON : 01:55 - 02:50(CV 202)\n\nTUE : 03:55 - 04:45(CV 202)\n\nTHU : 11:10 - 12:05(CV 202)\n\nFRI : 09:00 - 09:55(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV71\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Um9ISkE5enVXVzg";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("DSS"))
                    {
                        switch (tb){
                            case 0 :return "Design of Steel Structures";                 //name

                            case 1 :return "TUE : 09:55 - 10:50(CV 202)\n\nTUE : 12:05 - 01:00(CV 202)\n\nWED : 03:00 - 03:55(CV 202)\n\nWED : 03:55 - 04:45(CV 202)\n\nFRI : 01:55 - 02:50(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV72\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7bVRmMTBYOGRmelE";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("E & V"))
                    {
                        switch (tb){
                            case 0 :return "Estimation & Valuation";                 //name

                            case 1 :return "MON : 12:05 - 01:00(CV 202)\n\nTUE : 01:55 - 02:50(CV 202)\n\nTUE : 03:00 - 03:55(CV 202)\n\nTHU : 09:00 - 09:55(CV 202)\n\nFRI : 03:55 - 04:45(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV73\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MmpRNlNYUGlXMDQ";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("DPSC"))
                    {
                        switch (tb){
                            case 0 :return "Design of Pre-stressed Concrete Structures";                 //name

                            case 1 :return "MON : 03:00 - 03:55(CV 202)\n\nMON : 03:55 - 04:45(CV 202)\n\nTUE : 09:00 - 09:55(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV73\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7SXdYRWxmVmZjZ1E";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("HGD"))
                    {
                        switch (tb){
                            case 0 :return "Highway Geometric Design";                 //name

                            case 1 :return "WED : 12:05 - 01:00(CV 202)\n\nTHU : 12:05 - 01:00(CV 202)\n\nFRI : 12:05 - 01:00(CV 202)\n\nFRI : 03:00 - 03:55(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV755\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7WG00OWZ5Um5BZVE";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("SWM"))
                    {
                        switch (tb){
                            case 0 :return "Solid Waste Management";                 //name

                            case 1 :return "WED : 12:05 - 01:00(CV 202)\n\nTHU : 12:05 - 01:00(CV 202)\n\nFRI : 12:05 - 01:00(CV 202)\n\nFRI : 03:00 - 03:55(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV757\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7Z0RZcEplLXdOckE";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("PMC"))
                    {
                        switch (tb){
                            case 0 :return "Pavement Materials and Construction";                 //name

                            case 1 :return "TUE : 11:10 - 12:05(CV 202)\n\nWED : 01:55 - 02:50(CV 202)\n\nTHU : 09:55 - 10:50(CV 202)\n\nFRI : 09:55 - 10:50(CV 202)";                 //tb1

                            case 2 :return "Subject Code : 15CV763\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UnJfRW5zZklNenc";                 //tb3

                            default:return "Data not available";
                        }

                    }else if (sub.equalsIgnoreCase("C&HM/EE LAB"))
                    {
                        switch (tb){
                            case 0 :return "C&HM / EE LAB";                 //name

                            case 1 :return "MON : 09:00 - 12:05(LAB)\n\nWED : 09:00 - 12:05(LAB)\n\nTHU : 01:55 - 04:45(LAB)";                 //tb1

                            case 2 :return "Subject Code : 15CVL77\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 42\n\nIA Marks : 25\n\nExam Marks : 50\n\nExam Hours : 03";                 //tb2

                            case 3 :return "";                 //tb3

                            default:return "Data not available";
                        }

                    }

                }

            } else if (branch.equalsIgnoreCase("Computer Science and Engineering")) {
                if (year.equalsIgnoreCase("2nd year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("MAT"))
                        {
                            switch (tb){
                                case 0 :return "Engineering Mathematics - III";                 //name

                                case 1 :return "TUE : 03:00 - 03:55(201)\n\nWED : 09:55 - 10:50(201)\n\nTHU : 01:55 - 02:50(201)\n\nFRI : 09:00 - 09:55(201)";                 //tb1

                                case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ADE"))
                        {
                            switch (tb){
                                case 0 :return "Analog And Digital Electronics";                 //name

                                case 1 :return "MON : 09:00 - 09:55(201)\n\nTUE : 11:10 - 12:05(201)\n\nTUE : 03:55 - 04:45(201)\n\nFRI : 01:55 - 02:50(201)";                 //tb1

                                case 2 :return "Subject Code : 15CS32\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7WEMwOFc2OXo3bEE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DS"))
                        {
                            switch (tb){
                                case 0 :return "Data Structures And Applications";                 //name

                                case 1 :return "MON : 09:55 - 10:50(201)\n\nTUE : 09:55 - 10:50(201)\n\nWED : 09:00 - 09:55(201)\n\nTHU : 03:00 - 03:55(201)";                 //tb1

                                case 2 :return "Subject Code : 15CS33\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7elRlUlJUYktOOVk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CO"))
                        {
                            switch (tb){
                                case 0 :return "Computer Organization";                 //name

                                case 1 :return "TUE : 12:05 - 01:00(201)\n\nWED : 11:10 - 12:05(201)\n\nTHU : 03:55 - 04:45(201)\n\nFRI : 11:10 - 12:05(201)";                 //tb1

                                case 2 :return "Subject Code : 15CS34\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZkNXLTNGR0laOHM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("USP"))
                        {
                            switch (tb){
                                case 0 :return "Unix And Shell Programming";                 //name

                                case 1 :return "MON : 11:10 - 12:05(201)\n\nTUE : 01:55 - 02:50(201)\n\nWED : 12:05 - 01:00(201)\n\nFRI : 12:05 - 01:00(201)";                 //tb1

                                case 2 :return "Subject Code : 15CS35\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7N05JTjFiVVNXdUU";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DMS"))
                        {
                            switch (tb){
                                case 0 :return "Discrete Mathematical Structures";                 //name

                                case 1 :return "MON : 12:05 - 01:00(201)\n\nTUE : 09:00 - 09:55(201)\n\nTHU : 12:05 - 01:00(201)\n\nFRI : 09:55 - 10:50(201)";                 //tb1

                                case 2 :return "Subject Code : 15CS36\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZUZOaVV1N2ZYX2s";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DS/ADE LAB"))
                        {
                            switch (tb){
                                case 0 :return "DS/ADE LAB";                 //name

                                case 1 :return "MON : 01:55 - 04:45(LAB)\n\nWED : 01:55 - 04:45(LAB)\n\nTHU : 09:00 - 12:05(LAB)";                 //tb1

                                case 2 :return "CREDITS : 02\n\nNumber of Lecture Hours/Week : 01 + 02\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("LANG LAB"))
                        {
                            switch (tb){
                                case 0 :return "LANGUAGE LAB";                 //name

                                case 1 :return "Friday : 03:00 - 04:45";                 //tb1

                                case 2 :return "";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("LANG LAB"))
                        {
                            switch (tb){
                                case 0 :return "LANGUAGE LAB";                 //name

                                case 1 :return "Friday : 03:00 - 04:45";                 //tb1

                                case 2 :return "";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MAT"))
                        {
                            switch (tb){
                                case 0 :return "Engineering Mathematics - III";                 //name

                                case 1 :return "MON : 03:00 - 03:55(202)\n\nTUE : 12:05 - 01:00(202)\n\nWED : 09:00 - 09:55(202)\n\nTHU : 11:10 - 12:05(202)";                 //tb1

                                case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ADE"))
                        {
                            switch (tb){
                                case 0 :return "Analog And Digital Electronics";                 //name

                                case 1 :return "MON : 03:55 - 04:45(202)\n\nTUE : 09:00 - 09:55(202)\n\nWED : 11:10 - 12:05(202)\n\nTHU : 01:55 - 02:50(202)";                 //tb1

                                case 2 :return "Subject Code : 15CS32\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7WEMwOFc2OXo3bEE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DS"))
                        {
                            switch (tb){
                                case 0 :return "Data Structures And Applications";                 //name

                                case 1 :return "TUE : 11:10 - 12:05(202)\n\nWED : 12:05 - 01:00(202)\n\nTHU : 09:55 - 10:50(202)\n\nTHU : 03:00 - 03:55(202)";                 //tb1

                                case 2 :return "Subject Code : 15CS33\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7elRlUlJUYktOOVk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CO"))
                        {
                            switch (tb){
                                case 0 :return "Computer Organization";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(202)\n\nWED : 01:55 - 02:50(202)\n\nTHU : 09:00 - 09:55(202)\n\nFRI : 03:55 - 04:45(202)";                 //tb1

                                case 2 :return "Subject Code : 15CS34\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZkNXLTNGR0laOHM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("USP"))
                        {
                            switch (tb){
                                case 0 :return "Unix And Shell Programming";                 //name

                                case 1 :return "MON : 01:55 - 02:50(202)\n\nWED : 09:55 - 10:50(202)\n\nTHU : 03:55 - 04:45(202)\n\nFRI : 12:05 - 01:00(202)";                 //tb1

                                case 2 :return "Subject Code : 15CS35\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7N05JTjFiVVNXdUU";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DMS"))
                        {
                            switch (tb){
                                case 0 :return "Discrete Mathematical Structures";                 //name

                                case 1 :return "MON : 12:05 - 01:00(202)\n\nWED : 03:00 - 03:55(202)\n\nTHU : 12:05 - 01:00(202)\n\nFRI : 03:00 - 03:55(202)";                 //tb1

                                case 2 :return "Subject Code : 15CS36\n\nCREDITS : 04 \n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZUZOaVV1N2ZYX2s";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DS/ADE LAB"))
                        {
                            switch (tb){
                                case 0 :return "DS/ADE LAB";                 //name

                                case 1 :return "MON : 09:00 - 12:05(LAB)\n\nTUE : 01:55 - 04:45(LAB)\n\nFRI : 09:00 - 12:05(LAB)";                 //tb1

                                case 2 :return "CREDITS : 02\n\nNumber of Lecture Hours/Week : 01 + 02\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }

                        default:return "Data Not Available";
                    }


                } else if (year.equalsIgnoreCase("3rd year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("ME"))
                        {
                            switch (tb){
                                case 0 :return "Management and Entrepreneurship for IT Industry";                 //name

                                case 1 :return "MON : 03:00 - 03:55(201)\n\nWED : 01:55 - 02:50(203)\n\nTHU : 03:55 - 04:45(203)\n\nFRI : 09:55 - 10:50(203)";                 //tb1

                                case 2 :return "Subject Code : 15CS51\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aU5MM1pFQThlXzA";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CN"))
                        {
                            switch (tb){
                                case 0 :return "Computer Networks";                 //name

                                case 1 :return "MON : 03:55 - 04:45(201)\n\nWED : 11:10 - 12:05(203)\n\nTHU : 01:55 - 02:50(203)\n\nFRI : 01:55 - 02:50(203)";                 //tb1

                                case 2 :return "Subject Code : 15CS52\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXVKSDdPQkFPcU0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DBMS"))
                        {
                            switch (tb){
                                case 0 :return "Database Management System";                 //name

                                case 1 :return "MON : 01:55 - 02:50(201)\n\nTUE : 11:10 - 12:05(203)\n\nWED : 03:00 - 03:55(203)\n\nFRI : 09:00 - 09:55(203)";                 //tb1

                                case 2 :return "Subject Code : 15CS53\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7M3hUZHktRktLbFE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("FLAT"))
                        {
                            switch (tb){
                                case 0 :return "Automata Theory and Computability";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(203)\n\nWED : 09:00 - 09:55(203)\n\nTHU : 03:00 - 03:55(203)\n\nFRI : 11:10 - 12:05(203)";                 //tb1

                                case 2 :return "Subject Code : 15CS54\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7elVtTDZpNnZVRms";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("JAVA/ST"))
                        {
                            switch (tb){
                                case 0 :return "JAVA / ST";                 //name

                                case 1 :return "MON : 01:00 - 01:55(201/202)\n\nWED : 12:05 - 01:00(203/205)\n\nTHU : 12:05 - 01:00(203/205)";                 //tb1

                                case 2 :return "CREDITS : 03\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AI"))
                        {
                            switch (tb){
                                case 0 :return "Artificial Intelligence";                 //name

                                case 1 :return "TUE : 09:00 - 09:55(203)\n\nWED : 09:55 - 10:50(203)\n\nFRI : 03:00 - 03:55(203)";                 //tb1

                                case 2 :return "CREDITS : 03\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RHVEZEZXX2dNaXc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CN/DBMS LAB"))
                        {
                            switch (tb){
                                case 0 :return "CN / DBMS LAB";                 //name

                                case 1 :return "MON : 09:00 - 12:05(LAB)\n\nTUE : 01:55 - 04:45(LAB)\n\nTHU : 09:00 - 12:05(LAB)";                 //tb1

                                case 2 :return "CREDITS : 02\n\nNumber of Lecture Hours/Week : 1 + 2\n\nTotal Number of Lecture Hours : 40\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("ME"))
                        {
                            switch (tb){
                                case 0 :return "Management and Entrepreneurship for IT Industry";                 //name

                                case 1 :return "MON : 11:10 - 12:05(203)\n\nTUE : 11:10 - 12:05(204)\n\nTHU : 09:00 - 09:55(204)\n\nFRI : 01:55 - 02:50(204)";                 //tb1

                                case 2 :return "Subject Code : 15CS51\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aU5MM1pFQThlXzA";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CN"))
                        {
                            switch (tb){
                                case 0 :return "Computer Networks";                 //name

                                case 1 :return "MON : 09:00 - 09:55(203)\n\nTUE : 03:00 - 03:55(205)\n\nTHU : 09:55 - 10:50(204)\n\nFRI : 12:05 - 01:00(204)";                 //tb1

                                case 2 :return "Subject Code : 15CS52\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXVKSDdPQkFPcU0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DBMS"))
                        {
                            switch (tb){
                                case 0 :return "Database Management System";                 //name

                                case 1 :return "MON : 09:55 - 10:50(203)\n\nTUE : 01:55 - 02:50(205)\n\nWED : 11:10 - 12:05(204)\n\nTHU : 01:55 - 02:50(204)";                 //tb1

                                case 2 :return "Subject Code : 15CS53\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7M3hUZHktRktLbFE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("FLAT"))
                        {
                            switch (tb){
                                case 0 :return "Automata Theory and Computability";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(204)\n\nWED : 09:00 - 09:55(204)\n\nTHU : 11:10 - 12:05(204)\n\nFRI : 03:55 - 04:45(204)";                 //tb1

                                case 2 :return "Subject Code : 15CS54\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7elVtTDZpNnZVRms";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("JAVA/ST"))
                        {
                            switch (tb){
                                case 0 :return "JAVA / ST";                 //name

                                case 1 :return "MON : 01:00 - 01:55(203/202)\n\nWED : 12:05 - 01:00(204/205)\n\nTHU : 12:05 - 01:00(204/205)";                 //tb1

                                case 2 :return "CREDITS : 03\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AI"))
                        {
                            switch (tb){
                                case 0 :return "Artificial Intelligence";                 //name

                                case 1 :return "TUE : 09:00 - 09:55(204)\n\nWED : 09:55 - 10:50(204)\n\nFRI : 03:00 - 03:55(204)";                 //tb1

                                case 2 :return "CREDITS : 03\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours :03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RHVEZEZXX2dNaXc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CN/DBMS LAB"))
                        {
                            switch (tb){
                                case 0 :return "CN / DBMS LAB";                 //name

                                case 1 :return "MON : 01:55 - 04:45(LAB)\n\nWED : 01:55 - 04:45(LAB)\n\nFRI : 09:00 - 12:05(LAB)";                 //tb1

                                case 2 :return "CREDITS : 02\n\nNumber of Lecture Hours/Week : 1 + 2\n\nTotal Number of Lecture Hours : 40\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }

                        default:return "Data Not Available";
                    }

                } else if (year.equalsIgnoreCase("4th year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("OOMD"))
                        {
                            switch (tb){
                                case 0 :return "Object Oriented Modelling and Design";                 //name

                                case 1 :return "MON : 01:55 - 02:50(204)\n\nTUE : 09:55 - 10:50(205)\n\nTUE : 03:55 - 04:45(204)\n\nWED : 01:55 - 02:50(204)";                 //tb1

                                case 2 :return "Subject Code : 10CS71\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7NGRiVnhvMnBJOU0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ECS"))
                        {
                            switch (tb){
                                case 0 :return "Embedded Computing System";                 //name

                                case 1 :return "MON : 09:55 - 10:50(204)\n\nTUE : 01:55 - 02:50(204)\n\nWED : 03:00 - 03:55(204)\n\nTHU : 09:00 - 09:55(201)";                 //tb1

                                case 2 :return "Subject Code : 10CS72\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7dm1XMWNmR2tfeXc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("WEB"))
                        {
                            switch (tb){
                                case 0 :return "Programming The Web";                 //name

                                case 1 :return "MON : 11:10 - 12:05(204)\n\nTUE : 03:00 - 03:55(204)\n\nTHU : 11:10 - 12:05(201)\n\nFRI : 09:00 - 09:55(204)";                 //tb1

                                case 2 :return "Subject Code : 10CS73\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RjNDTUVTMVpYN28";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ACA"))
                        {
                            switch (tb){
                                case 0 :return "Advanced Computer Architecture";                 //name

                                case 1 :return "MON : 03:00 - 03:55(204)\n\nTUE : 09:00 - 09:55(205)\n\nWED : 03:55 - 04:45(204)\n\nFRI : 09:55 - 10:50(204)";                 //tb1

                                case 2 :return "Subject Code : 10CS74\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7YWRldDlfM2dlMFk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("JAVA/DM"))
                        {
                            switch (tb){
                                case 0 :return "JAVA / DM";                 //name

                                case 1 :return "MON : 12:05 - 01:00(204/203)\n\nTUE : 12:05 - 01:00(204/205)\n\nTHU : 01:00 - 01:55(205/204)\n\nFRI : 01:00 - 01:55(204/203)";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AI"))
                        {
                            switch (tb){
                                case 0 :return "Artificial Intelligence";                 //name

                                case 1 :return "MON : 09:00 - 09:55(204)\n\nTUE : 11:10 - 12:05(205)\n\nTHU : 09:55 - 10:50(201)\n\nFRI : 11:10 - 12:05(204)";                 //tb1

                                case 2 :return "Subject Code : 10CS764\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RHVEZEZXX2dNaXc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NW/WEB LAB"))
                        {
                            switch (tb){
                                case 0 :return "NW / WEB LAB";                 //name

                                case 1 :return "WED : 09:00 - 12:05(LAB)\n\nTHU : 01:55 - 04:45(LAB)\n\nFRI : 01:55 - 04:45(LAB)";                 //tb1

                                case 2 :return "Subject Code : 10CSL78\n\nHours/Week : 03\n\nTotal Hours : 42\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 50";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("OOMD"))
                        {
                            switch (tb){
                                case 0 :return "Object Oriented Modelling and Design";                 //name

                                case 1 :return "MON : 11:10 - 12:05(205)\n\nTUE : 09:00 - 09:55(206)\n\nTUE : 03:00 - 03:55(203)\n\nTHU : 11:10 - 12:05(205)";                 //tb1

                                case 2 :return "Subject Code : 10CS71\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7NGRiVnhvMnBJOU0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ECS"))
                        {
                            switch (tb){
                                case 0 :return "Embedded Computing System";                 //name

                                case 1 :return "MON : 09:00 - 09:55(205)\n\nTUE : 11:10 - 12:05(206)\n\nWED : 03:55 - 04:45(205)\n\nTHU : 09:55 - 10:50(205)";                 //tb1

                                case 2 :return "Subject Code : 10CS72\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7dm1XMWNmR2tfeXc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("WEB"))
                        {
                            switch (tb){
                                case 0 :return "Programming The Web";                 //name

                                case 1 :return "MON : 03:00 - 03:55(205)\n\nTUE : 09:55 - 10:50(206)\n\nTHU : 09:00 - 09:55(205)\n\nFRI : 11:10 - 12:05(205)";                 //tb1

                                case 2 :return "Subject Code : 10CS73\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RjNDTUVTMVpYN28";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ACA"))
                        {
                            switch (tb){
                                case 0 :return "Advanced Computer Architecture";                 //name

                                case 1 :return "MON : 09:55 - 10:50(205)\n\nTUE : 03:55 - 04:45(203)\n\nWED : 03:00 - 03:55(205)\n\nFRI : 09:55 - 10:50(205)";                 //tb1

                                case 2 :return "Subject Code : 10CS74\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7YWRldDlfM2dlMFk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("JAVA/DM"))
                        {
                            switch (tb){
                                case 0 :return "JAVA / DM";                 //name

                                case 1 :return "MON : 12:05 - 01:00(205/203)\n\nTUE : 12:05 - 01:00(203/205)\n\nTHU : 01:00 - 01:55(205/204)\n\nFRI : 01:00 - 01:55(205/203)";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AI"))
                        {
                            switch (tb){
                                case 0 :return "Artificial Intelligence";                 //name

                                case 1 :return "MON : 01:55 - 02:50(205)\n\nTUE : 01:55 - 02:50(203)\n\nWED : 01:55 - 02:50(205)\n\nFRI : 09:00 - 09:55(205)";                 //tb1

                                case 2 :return "Subject Code : 10CS764\n\nHours/Week : 04\n\nTotal Hours : 52\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RHVEZEZXX2dNaXc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NW/WEB LAB"))
                        {
                            switch (tb){
                                case 0 :return "NW / WEB LAB";                 //name

                                case 1 :return "WED : 09:00 - 12:05(LAB)\n\nTHU : 01:55 - 04:45(LAB)\n\nFRI : 01:55 - 04:45(LAB)";                 //tb1

                                case 2 :return "Subject Code : 10CSL78\n\nHours/Week : 03\n\nTotal Hours : 42\n\nI.A. Marks : 25\n\nExam Hours : 03\n\nExam  Marks : 50";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        default:return "Data Not Available";
                    }

                }

            } else if (branch.equalsIgnoreCase("Electronics and Communication Engineering")) {
                if (year.equalsIgnoreCase("2nd year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("M3"))
                            {
                                switch (tb){
                                    case 0 :return "Engineering Mathematics - III";                 //name

                                    case 1 :return "MON : 12:05 - 01:00(EC 201)\n\nTUE : 09:00 - 09:55(EC 201)\n\nWED : 09:55 - 10:50(EC 201)\n\nFRI : 01:55 - 02:50(EC 201)";                 //tb1

                                    case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                    case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                                    default:return "Data not available";
                                }

                            }else if (sub.equalsIgnoreCase("DE"))
                        {
                            switch (tb){
                                case 0 :return "Digital Electronics";                 //name

                                case 1 :return "MON : 03:00 - 03:55(EC 201)\n\nTUE : 03:00 - 03:55(EC 201)\n\nWED : 11:10 - 12:05(EC 201)\n\nTHU : 09:00 - 09:55(EC 201)";                 //tb1

                                case 2 :return "Subject Code : 15EC33\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cFF4SGpnbzNZMlE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AE"))
                        {
                            switch (tb){
                                case 0 :return "Analog Electronics";                 //name

                                case 1 :return "MON : 09:00 - 09:55(EC 201)\n\nWED : 12:05 - 01:00(EC 201)\n\nTHU : 11:10 - 12:05(EC 201)\n\nFRI : 03:00 - 03:55(EC 201)";                 //tb1

                                case 2 :return "Subject Code : 15EC32\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7V0RJQ3ZzYlJlSjA";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NA"))
                        {
                            switch (tb){
                                case 0 :return "Network Analysis";                 //name

                                case 1 :return "MON : 11:10 - 12:05(EC 201)\n\nTUE : 11:10 - 12:05(EC 201)\n\nWED : 09:00 - 09:55(EC 201)\n\nTHU : 12:05 - 01:00(EC 201)\n\nTHU : 03:00 - 03:55(EC 201)";                 //tb1

                                case 2 :return "Subject Code : 15EC34\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RlVZRzdJSlQxa1k";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("EI"))
                        {
                            switch (tb){
                                case 0 :return "Electronic Instrumentation";                 //name

                                case 1 :return "TUE : 12:05 - 01:00(EC 201)\n\nTUE : 03:55 - 04:45(EC 201)\n\nTHU : 09:55 - 10:50(EC 201)\n\nFRI : 03:55 - 04:45(EC 201)";                 //tb1

                                case 2 :return "Subject Code : 15EC35\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aXI1ZExZY0E2UjQ";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("EEM"))
                        {
                            switch (tb){
                                case 0 :return "Engg. Electromagnetics";                 //name

                                case 1 :return "MON : 09:55 - 10:50(EC 201)\n\nTUE : 09:55 - 10:50(EC 201)\n\nTHU : 01:55 - 02:50(EC 201)\n\nFRI : 12:05 - 01:00(EC 201)";                 //tb1

                                case 2 :return "Subject Code : 15EC36\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RzVHbjFvMW16ek0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AE/DE LAB"))
                        {
                            switch (tb){
                                case 0 :return "AE/DE LAB";                 //name

                                case 1 :return "Wednesday:\nAE LAB - A1\nDE LAB - A2\n\nFriday:\nAE LAB - A2\nDE LAB - A1";                 //tb1

                                case 2 :return "Subject Code : 15ECL37\n\nCREDITS : 02\n\nNumber of Lecture Hours/Week : 01+02\n\nTotal Number of Lecture Hours : 42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "WED : 01:55 - 02:50(LAB)\n\nWED : 03:00 - 03:55(LAB)\n\nWED : 03:55 - 04:45(LAB)\n\nFRI : 09:00 - 09:55(LAB)\n\nFRI : 09:55 - 10:50(LAB)\n\nFRI : 11:10 - 12:05(LAB)";                 //tb3

                                default:return "Data not available";
                            }



                        }
                        case "B":if (sub.equalsIgnoreCase("DIP MATHS/EVS "))
                        {
                            switch (tb){
                                case 0 :return "Diploma Maths / EVS";                 //name

                                case 1 :return "Room No : LH206";                 //tb1

                                case 2 :return "";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7czJtYnRmZGUwY3M";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("M3"))
                        {
                            switch (tb){
                                case 0 :return "Engineering Mathematics - III";                 //name

                                case 1 :return "MON : 12:05 - 01:00(EC 202)\n\nWED : 12:05 - 01:00(EC 202)\n\nTHU : 11:10 - 12:05(EC 202)\n\nFRI : 09:00 - 09:55(EC 202)";                 //tb1

                                case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DE"))
                        {
                            switch (tb){
                                case 0 :return "Digital Electronics";                 //name

                                case 1 :return "MON : 11:10 - 12:05(EC 202)\n\nTUE : 11:10 - 12:05(EC 202)\n\nWED : 01:55 - 02:50(EC 202)\n\nTHU : 12:05 - 01:00(EC 202)";                 //tb1

                                case 2 :return "Subject Code : 15EC33\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7cFF4SGpnbzNZMlE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AE"))
                        {
                            switch (tb){
                                case 0 :return "Analog Electronics";                 //name

                                case 1 :return "MON : 01:55 - 02:50(EC 202)\n\nTHU : 09:00 - 09:55(EC 202)\n\nTHU : 03:00 - 03:55(EC 202)\n\nFRI : 11:10 - 12:05(EC 202)";                 //tb1

                                case 2 :return "Subject Code : 15EC32\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7V0RJQ3ZzYlJlSjA";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NA"))
                        {
                            switch (tb){
                                case 0 :return "Network Analysis";                 //name

                                case 1 :return "TUE : 09:00 - 09:55(EC 202)\n\nWED : 03:00 - 03:55(EC 202)\n\nTHU : 09:55 - 10:50(EC 202)\n\nFRI : 09:55 - 10:50(EC 202)";                 //tb1

                                case 2 :return "Subject Code : 15EC34\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RlVZRzdJSlQxa1k";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("EI"))
                        {
                            switch (tb){
                                case 0 :return "Electronic Instrumentation";                 //name

                                case 1 :return "MON : 09:00 - 09:55(EC 202)\n\nTUE : 12:05 - 01:00(EC 202)\n\nWED : 03:55 - 04:45(EC 202)\n\nTHU : 03:55 - 04:45(EC 202)";                 //tb1

                                case 2 :return "Subject Code : 15EC35\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7aXI1ZExZY0E2UjQ";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("EEM"))
                        {
                            switch (tb){
                                case 0 :return "Engg. Electromagnetics";                 //name

                                case 1 :return "MON : 09:55 - 10:50(EC 202)\n\nTUE : 09:55 - 10:50(EC 202)\n\nTHU : 01:55 - 02:50(EC 202)\n\nFRI : 12:05 - 01:00(EC 202)";                 //tb1

                                case 2 :return "Subject Code : 15EC36\n\nCREDITS : 04\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RzVHbjFvMW16ek0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("AE/DE LAB"))
                        {
                            switch (tb){
                                case 0 :return "AE/DE LAB";                 //name

                                case 1 :return "Wednesday:\nAE LAB - A1\nDE LAB - A2\n\nFriday:\nAE LAB - A2\nDE LAB - A1";                 //tb1

                                case 2 :return "Subject Code : 15ECL37\n\nCREDITS : 02\n\nNumber of Lecture Hours/Week : 01+02\n\nTotal Number of Lecture Hours : 42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }



                        }
                        else if (sub.equalsIgnoreCase("ITC"))
                        {
                            switch (tb){
                                case 0 :return "INFORMATION THEORY AND CODING";                 //name

                                case 1 :return "MON : 01:55 - 02:50(EC 203)\n\nTUE : 03:00 - 03:55(EC 203)\n\nWED : 01:55 - 02:50(EC 203)\n\nFRI : 09:00 - 09:55(EC 203)";                 //tb1

                                case 2 :return "Subject Code : 15ES54\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        default:return "Data Not Available";
                    }

                } else if (year.equalsIgnoreCase("3rd year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("DSP/HDL LAB"))
                        {
                            switch (tb){
                                case 0 :return "DSP/HDL LAB";                 //name

                                case 1 :return "Monday:\nDSP LAB – A1\nHDL LAB – A2\n\nTuesday:\nDSP LAB – A2\nHDL LAB – A3\n\nThursday:\nDSP LAB – B3\nHDL LAB – B1";                 //tb1

                                case 2 :return "Subject Code : 15ECL58\n\nNumber of Lecture Hours/Week : 01 + 02\n\nTotal Number of Lecture Hours : 42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ME"))
                        {
                            switch (tb){
                                case 0 :return "Management & Entrepreneurship";                 //name

                                case 1 :return "MON : 03:00 - 03:55(EC 203)\n\nTUE : 12:05 - 01:00(EC 203)\n\nWED : 09:55 - 10:50(EC 203)\n\nFRI : 12:05 - 01:00(EC 203)";                 //tb1

                                case 2 :return "Subject Code : 15ES51\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DSP"))
                        {
                            switch (tb){
                                case 0 :return "Digital Signal Processing";                 //name

                                case 1 :return "TUE : 01:55 - 02:50(EC 203)\n\nWED : 11:10 - 12:05(EC 203)\n\nTHU : 11:10 - 12:05(EC 203)\n\nFRI : 01:55 - 02:50(EC 203)";                 //tb1

                                case 2 :return "Subject Code : 15EC52\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("HDL"))
                        {
                            switch (tb){
                                case 0 :return "Verilog HDL";                 //name

                                case 1 :return "TUE : 03:55 - 04:45(EC 203)\n\nWED : 09:00 - 09:55(EC 203)\n\nTHU : 12:05 - 01:00(EC 203)\n\nFRI : 09:55 - 10:50(EC 203)";                 //tb1

                                case 2 :return "Subject Code : 15EC53\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("OS"))
                        {
                            switch (tb){
                                case 0 :return "Operating Systems";                 //name

                                case 1 :return "MON : 12:05 - 01:00(EC 203)\n\nWED : 03:00 - 03:55(EC 203)\n\nTHU : 09:00 - 09:55(EC 203)\n\nFRI : 11:10 - 12:05(EC 203)";                 //tb1

                                case 2 :return "Subject Code : 15EC553\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7SDR0MlhJazYxbHM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("C++"))
                        {
                            switch (tb){
                                case 0 :return "OOP using C++";                 //name

                                case 1 :return "MON : 03:55 - 04:45(EC 203)\n\nWED : 12:05 - 01:00(EC 203)\n\nTHU : 09:55 - 10:50(EC 203)\n\nFRI : 03:00 - 03:55(EC 203)";                 //tb1

                                case 2 :return "Subject Code : 15EC562\n\nCredit : 03\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7QUVoR0ZSNVdEU2s";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("DSP/HDL LAB"))
                        {
                            switch (tb){
                                case 0 :return "DSP/HDL LAB";                 //name

                                case 1 :return "Monday:\nDSP LAB – A1\nHDL LAB – A2\n\nTuesday:\nDSP LAB – A2\nHDL LAB – A3\n\nThursday:\nDSP LAB – B3\nHDL LAB – B1";                 //tb1

                                case 2 :return "Subject Code : 15ECL58\n\nNumber of Lecture Hours/Week : 01 + 02\n\nTotal Number of Lecture Hours : 42\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        else if (sub.equalsIgnoreCase("ITC"))
                        {
                            switch (tb){
                                case 0 :return "INFORMATION THEORY AND CODING";                 //name

                                case 1 :return "MON : 09:55 - 10:50(EC 012)\n\nTUE : 09:00 - 09:55(EC 012)\n\nWED : 09:55 - 10:50(EC 012)\n\nFRI : 12:05 - 01:00(EC 012)";                 //tb1

                                case 2 :return "Subject Code : 15EC54\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ME"))
                        {
                            switch (tb){
                                case 0 :return "Management & Entrepreneurship";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(EC 012)\n\nWED : 11:10 - 12:05(EC 012)\n\nTHU : 01:55 - 02:50(EC 012)\n\nFRI : 01:55 - 02:50(EC 012)";                 //tb1

                                case 2 :return "Subject Code : 15ES51\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DSP"))
                        {
                            switch (tb){
                                case 0 :return "Digital Signal Processing";                 //name

                                case 1 :return "MON : 12:05 - 01:00(EC 012)\n\nWED : 09:00 - 09:55(EC 012)\n\nTHU : 03:55 - 04:45(EC 012)\n\nFRI : 09:55 - 10:50(EC 012)";                 //tb1

                                case 2 :return "Subject Code : 15EC52\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("HDL"))
                        {
                            switch (tb){
                                case 0 :return "Verilog HDL";                 //name

                                case 1 :return "MON : 09:00 - 09:55(EC 012)\n\nTUE : 12:05 - 01:00(EC 012)\n\nWED : 12:05 - 01:00(EC 012)\n\nFRI : 09:00 - 09:55(EC 012)";                 //tb1

                                case 2 :return "Subject Code : 15EC53\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("OS"))
                        {
                            switch (tb){
                                case 0 :return "Operating Systems";                 //name

                                case 1 :return "MON : 11:10 - 12:05(EC 012)\n\nWED : 01:55 - 02:50(EC 012)\n\nTHU : 03:00 - 03:55(EC 012)\n\nFRI : 11:10 - 12:05(EC 012)";                 //tb1

                                case 2 :return "Subject Code : 15EC553\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7SDR0MlhJazYxbHM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("C++"))
                        {
                            switch (tb){
                                case 0 :return "OOP using C++";                 //name

                                case 1 :return "TUE : 11:10 - 12:05(EC 012)\n\nWED : 03:00 - 03:55(EC 012)\n\nTHU : 01:00 - 01:55(EC 012)\n\nFRI : 03:00 - 03:55(EC 012)";                 //tb1

                                case 2 :return "Subject Code : 15EC562\n\nCredit : 03\n\nNumber of Lecture Hours/Week : 03\n\nTotal Number of Lecture Hours : 40\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7QUVoR0ZSNVdEU2s";                 //tb3

                                default:return "Data not available";
                            }

                        }

                        default:return "Data Not Available";
                    }

                } else if (year.equalsIgnoreCase("4th year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("CCN"))
                        {
                            switch (tb){
                                case 0 :return "Computer Communication Networks";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(EC 010)\n\nWED : 01:55 - 02:50(EC 010)\n\nTHU : 01:55 - 02:50(EC 010)\n\nFRI : 01:55 - 02:50(EC 010)";                 //tb1

                                case 2 :return "Subject Code : 15EEC71\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RjFCZHN2Yzl5UHM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("OFC"))
                        {
                            switch (tb){
                                case 0 :return "Optical Fiber Communication";                 //name

                                case 1 :return "MON : 09:55 - 10:50(EC 010)\n\nTUE : 01:55 - 02:50(EC 010)\n\nWED : 03:55 - 04:45(EC 010)\n\nTHU : 03:00 - 03:55(EC 010)";                 //tb1

                                case 2 :return "Subject Code : 15EEC72\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7bkJfeTFTTHJESmM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("PE"))
                        {
                            switch (tb){
                                case 0 :return "Power Electronics";                 //name

                                case 1 :return "TUE : 09:00 - 09:55(EC 010)\n\nWED : 03:00 - 03:55(EC 010)\n\nTHU : 11:10 - 12:05(EC 010)\n\nFRI : 03:00 - 03:55(EC 010)";                 //tb1

                                case 2 :return "Subject Code : 15EEC73\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7b056SVFRMmpoREk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ESD"))
                        {
                            switch (tb){
                                case 0 :return "Embedded System Design";                 //name

                                case 1 :return "MON : 09:00 - 09:55(EC 010)\n\nTUE : 01:00 - 01:55(EC 010)\n\nWED : 12:05 - 01:00(EC 010)\n\nTHU : 09:55 - 10:50(EC 010)";                 //tb1

                                case 2 :return "Subject Code : 15EEC74\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7V1NiSl9HYWNEWkE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("Elec-1"))
                        {
                            switch (tb){
                                case 0 :return "Elec-1";                 //name

                                case 1 :return "DSP Algorithm & Architecture (EC010)/\n"+"CAD for VLSI (EC011)\n\nMon: 11:10-12:05\nTue: 3:00-3:55\nThu: 12:05-1:00\nFri: 1:00-1:55 ";                 //tb1

                                case 2 :return "Number of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("IP"))
                        {
                            switch (tb){
                                case 0 :return "Image Processing";                 //name

                                case 1 :return "MON : 12:05 - 01:00(EC 010)\n\nTUE : 11:10 - 12:05(EC 010)\n\nTHU : 09:00 - 09:55(EC 010)\n\nFRI : 03:55 - 04:45(EC 010)";                 //tb1

                                case 2 :return "Subject Code : 15EEC763\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7YWMwUzktdGVKcjA";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("VLSI/PE LAB"))
                        {
                            switch (tb){
                                case 0 :return "VLSI / PE LAB";                 //name

                                case 1 :return "Monday:\nVLSI Lab – A1\nPE Lab – A2\n\nWednesday:\nVLSI Lab – A2\nPE Lab – A3\n\nVLSI Lab – A3\nPE Lab – A1";                 //tb1

                                case 2 :return "Subject Code : 10ECL78\n\nNo. of Practical Hrs/Week : 03\n\nTotal no. of Practical Hrs. : 42\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 50";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("CCN"))
                        {
                            switch (tb){
                                case 0 :return "Computer Communication Networks";                 //name

                                case 1 :return "MON : 09:00 - 09:55(EC 011)\n\nTUE : 12:05 - 01:00(EC 011)\n\nWED : 09:55 - 10:50(EC 011)\n\nTHU : 11:10 - 12:05(EC 011)";                 //tb1

                                case 2 :return "Subject Code : 15EEC71\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RjFCZHN2Yzl5UHM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("OFC"))
                        {
                            switch (tb){
                                case 0 :return "Optical Fiber Communication";                 //name

                                case 1 :return "MON : 01:55 - 02:50(EC 011)\n\nWED : 11:10 - 12:05(EC 011)\n\nTHU : 01:55 - 02:50(EC 011)\n\nFRI : 09:55 - 10:50(EC 011)";                 //tb1

                                case 2 :return "Subject Code : 15EEC72\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7bkJfeTFTTHJESmM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("PE"))
                        {
                            switch (tb){
                                case 0 :return "Power Electronics";                 //name

                                case 1 :return "MON : 12:05 - 01:00(EC 011)\n\nTUE : 03:55 - 04:45(EC 011)\n\nTHU : 09:55 - 10:50(EC 011)\n\nFRI : 09:00 - 09:55(EC 011)";                 //tb1

                                case 2 :return "Subject Code : 15EEC73\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7b056SVFRMmpoREk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("ESD"))
                        {
                            switch (tb){
                                case 0 :return "Embedded System Design";                 //name

                                case 1 :return "MON : 03:00 - 03:55(EC 011)\n\nTUE : 01:55 - 02:50(EC 011)\n\nWED : 09:00 - 09:55(EC 011)\n\nTHU : 09:00 - 09:55(EC 011)";                 //tb1

                                case 2 :return "Subject Code : 15EEC74\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7V1NiSl9HYWNEWkE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("Elec-1"))
                        {
                            switch (tb){
                                case 0 :return "Elec-1";                 //name

                                case 1 :return "DSP Algorithm & Architecture (EC010)/\n"+"CAD for VLSI (EC011)\n\nMon: 11:10-12:05\nTue: 3:00-3:55\nThu: 12:05-1:00\nFri: 1:00-1:55 ";                 //tb1

                                case 2 :return "Number of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("IP"))
                        {
                            switch (tb){
                                case 0 :return "Image Processing";                 //name

                                case 1 :return "MON : 09:55 - 10:50(EC 011)\n\nWED : 12:05 - 01:00(EC 011)\n\nTHU : 03:00 - 03:55(EC 011)\n\nFRI : 11:10 - 12:05(EC 011)";                 //tb1

                                case 2 :return "Subject Code : 15EEC763\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 52\n\nIA Marks : 25\n\nExam Marks : 100\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7YWMwUzktdGVKcjA";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("VLSI/PE LAB"))
                        {
                            switch (tb){
                                case 0 :return "VLSI / PE LAB";                 //name

                                case 1 :return "Monday:\nVLSI Lab – A1\nPE Lab – A2\n\nWednesday:\nVLSI Lab – A2\nPE Lab – A3\n\nVLSI Lab – A3\nPE Lab – A1";                 //tb1

                                case 2 :return "Subject Code : 10ECL78\n\nNo. of Practical Hrs/Week : 03\n\nTotal no. of Practical Hrs. : 42\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 50";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        default:return "Data Not Available";
                    }
                }

            } else if (branch.equalsIgnoreCase("Mechanical Engineering")) {
                if (year.equalsIgnoreCase("2nd year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("M3"))
                            {
                                switch (tb){
                                    case 0 :return "Engineering Mathematics - III";                 //name

                                    case 1 :return "MON : 11:10 - 12:05(ME 201)\n\nTUE : 09:00 - 09:55(ME 201)\n\nTHU : 01:55 - 02:50(ME 201)\n\nFRI : 12:05 - 01:00(ME 201)";                 //tb1

                                    case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                    case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                                    default:return "Data not available";
                                }

                            }else if (sub.equalsIgnoreCase("MSM"))
                        {
                            switch (tb){
                                case 0 :return "MATERIAL SCIENCE AND METALLURGY";                 //name

                                case 1 :return "MON : 09:55 - 10:50(ME 201)\n\nMON : 01:55 - 02:50(ME 201)\n\nTUE : 11:10 - 12:05(ME 201)\n\nWED : 01:55 - 02:50(ME 201)";                 //tb1

                                case 2 :return "Subject Code : 15ME32\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S1h5VnBrdFctb2s";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("BTD"))
                        {
                            switch (tb){
                                case 0 :return "BASIC THERMODYNAMICS";                 //name

                                case 1 :return "MON : 03:00 - 03:55(ME 201)\n\nTUE : 09:55 - 10:50(ME 201)\n\nTUE : 12:05 - 01:00(ME 201)\n\nWED : 01:00 - 01:55(ME 201)\n\nTHU : 01:00 - 01:55(ME 201)";                 //tb1

                                case 2 :return "Subject Code : 15ME33\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RFV5YjUxT016MVk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MOM"))
                        {
                            switch (tb){
                                case 0 :return "MECHANICS OF MATERIALS";                 //name

                                case 1 :return "MON : 09:00 - 09:55(ME 201)\n\nMON : 12:05 - 01:00(ME 201)\n\nWED : 03:55 - 04:45(ME 201)\n\nTHU : 03:00 - 03:55(ME 201)\n\nFRI : 09:55 - 10:50(ME 201)";                 //tb1

                                case 2 :return "Subject Code : 15ME34\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7QWFxLVpPUU9fNFk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MCW"))
                        {
                            switch (tb){
                                case 0 :return "METAL CASTING & WELDING";                 //name

                                case 1 :return "MON : 09:55 - 10:50(ME 201)\n\nMON : 01:55 - 02:50(ME 201)\n\nTUE : 11:10 - 12:05(ME 201)\n\nWED : 01:55 - 02:50(ME 201)";                 //tb1

                                case 2 :return "Subject Code : 15ME35\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UkJSRFNMSWUzTk0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CAMD"))
                        {
                            switch (tb){
                                case 0 :return "COMPUTER AIDED MACHINE DRAWING";                 //name

                                case 1 :return "Tuesday: 01:55 - 04:45\nThursday: 09:00 - 12:05";                 //tb1

                                case 2 :return "Subject Code : 15ME36A / 46A\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 02 + 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXN5NGdqWGNWN2c";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MT/F&F LAB"))
                        {
                            switch (tb){
                                case 0 :return "MT / F&F LAB";                 //name

                                case 1 :return "Wednesday:\nMT LAB – A2\nF&F LAB – A1\n\nFriday:\nMT LAB – A1\nF&F LAB – A2 ";                 //tb1

                                case 2 :return "Subject Code : 15ME36B / 46B\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 02 + 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("M3"))
                        {
                            switch (tb){
                                case 0 :return "Engineering Mathematics - III";                 //name

                                case 1 :return "MON : 01:55 - 02:50(ME 202)\n\nTUE : 11:10 - 12:05(ME 202)\n\nWED : 12:05 - 01:00(ME 202)\n\nTHU : 09:00 - 09:55(ME 202)";                 //tb1

                                case 2 :return "Course  Code : 15MAT31\n\nCredits: 04\n\n\nNumber of Lecture Hours/Week : 04\n\nTotal Number of Lecture Hours : 50\n\nIA Marks : 20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ZWZ3eXNJSXR1NVE";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MSM"))
                        {
                            switch (tb){
                                case 0 :return "MATERIAL SCIENCE AND METALLURGY";                 //name

                                case 1 :return "MON : 03:55 - 04:45(ME 202)\n\nWED : 11:10 - 12:05(ME 202)\n\nTHU : 11:10 - 12:05(ME 202)\n\nFRI : 12:05 - 01:00(ME 202)";                 //tb1

                                case 2 :return "Subject Code : 15ME32\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S1h5VnBrdFctb2s";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("BTD"))
                        {
                            switch (tb){
                                case 0 :return "BASIC THERMODYNAMICS";                 //name

                                case 1 :return "TUE : 03:00 - 03:55(ME 202)\n\nWED : 09:55 - 10:50(ME 202)\n\nTHU : 09:55 - 10:50(ME 202)\n\nFRI : 01:55 - 02:50(ME 202)\n\nFRI : 03:55 - 04:45(ME 202)";                 //tb1

                                case 2 :return "Subject Code : 15ME33\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7RFV5YjUxT016MVk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MOM"))
                        {
                            switch (tb){
                                case 0 :return "MECHANICS OF MATERIALS";                 //name

                                case 1 :return "MON : 01:00 - 01:55(ME 202)\n\nTUE : 09:00 - 09:55(ME 202)\n\nTUE : 01:55 - 02:50(ME 202)\n\nWED : 09:00 - 09:55(ME 202)\n\nFRI : 03:00 - 03:55(ME 202)";                 //tb1

                                case 2 :return "Subject Code : 15ME34\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7QWFxLVpPUU9fNFk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MCW"))
                        {
                            switch (tb){
                                case 0 :return "METAL CASTING & WELDING";                 //name

                                case 1 :return "MON : 03:00 - 03:55(ME 202)\n\nTUE : 12:05 - 01:00(ME 202)\n\nTHU : 12:05 - 01:00(ME 202)";                 //tb1

                                case 2 :return "Subject Code : 15ME35\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UkJSRFNMSWUzTk0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CAMD"))
                        {
                            switch (tb){
                                case 0 :return "COMPUTER AIDED MACHINE DRAWING";                 //name

                                case 1 :return "Tuesday: 01:55 - 04:45\nThursday: 09:00 - 12:05";                 //tb1

                                case 2 :return "Subject Code : 15ME36A / 46A\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 02 + 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MXN5NGdqWGNWN2c";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("MT/F&F LAB"))
                        {
                            switch (tb){
                                case 0 :return "MT / F&F LAB";                 //name

                                case 1 :return "Wednesday:\nMT LAB – A2\nF&F LAB – A1\n\nFriday:\nMT LAB – A1\nF&F LAB – A2 ";                 //tb1

                                case 2 :return "Subject Code : 15ME36B / 46B\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 02 + 04\n\nTotal Number  of Lecture Hrs : 50\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        default:return "Data Not Available";
                    }

                } else if (year.equalsIgnoreCase("3rd year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("EM&E"))
                                 {
                                     switch (tb){
                                         case 0 :return "Engineering Management & Economics";                 //name

                                         case 1 :return "MON : 01:55 - 02:50(ME 101)\n\nTUE : 01:55 - 02:50(ME 101)\n\nTHU : 11:10 - 12:05(ME 101)\n\nFRI : 12:05 - 01:00(ME 101)";                 //tb1

                                         case 2 :return "Subject Code : 15ME51\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                         case 3 :return "";                 //tb3

                                         default:return "Data not available";
                                     }

                                 }else if (sub.equalsIgnoreCase("DOM"))
                                    {
                                        switch (tb){
                                            case 0 :return "Dynamics of Machinery";                 //name

                                            case 1 :return "MON : 03:00 - 03:55(ME 101)\n\nTUE : 03:00 - 03:55(ME 101)\n\nTHU : 09:55 - 10:50(ME 101)\n\nFRI : 09:00 - 09:55(ME 101)\n\nFRI : 11:10 - 12:05(ME 101)";                 //tb1

                                            case 2 :return "Subject Code : 15ME52\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                            case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7OXB3QzFRanFuMVk";                 //tb3

                                            default:return "Data not available";
                                        }

                                    }else if (sub.equalsIgnoreCase("TM"))
                        {
                            switch (tb){
                                case 0 :return "Turbo Machines";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(ME 101)\n\nTUE : 12:05 - 01:00(ME 101)\n\nWED : 09:00 - 09:55(ME 101)\n\nTHU : 12:05 - 01:00(ME 101)\n\nFRI : 03:00 - 03:55(ME 101)";                 //tb1

                                case 2 :return "Subject Code : 15ME53\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7WDdNLXRpQ1VaQVU";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DME-I"))
                        {
                            switch (tb){
                                case 0 :return "Design of Machine Elements – I";                 //name

                                case 1 :return "MON : 12:05 - 01:00(ME 101)\n\nTUE : 09:00 - 09:55(ME 101)\n\nWED : 11:10 - 12:05(ME 101)\n\nTHU : 09:00 - 09:55(ME 101)\n\nFRI : 09:55 - 10:50(ME 101)";                 //tb1

                                case 2 :return "Subject Code : 15ME54\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7LXBfejJMVFF6TEU";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NTM"))
                        {
                            switch (tb){
                                case 0 :return "Non Traditional Machining";                 //name

                                case 1 :return "TUE : 11:10 - 12:05(ME 101)\n\nWED : 09:55 - 10:50(ME 101)\n\nFRI : 01:55 - 02:50(ME 101)";                 //tb1

                                case 2 :return "Subject Code : 15ME554\n\nCREDITS – 03\n\nNumber of Lecture Hrs / Week : 03\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MFZ0RHBHMmpRb3c";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("E&E"))
                        {
                            switch (tb){
                                case 0 :return "Energy & Environment";                 //name

                                case 1 :return "MON : 03:55 - 04:45(ME 101)\n\nWED : 12:05 - 01:00(ME 101)\n\nTHU : 01:55 - 02:50(ME 101)";                 //tb1

                                case 2 :return "Subject Code : 15ME554\n\nCREDITS – 03\n\nNumber of Lecture Hrs / Week : 03\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eTNoc2ZQanI1bnM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("FM/EC LAB"))
                        {
                            switch (tb){
                                case 0 :return "FM / EC LAB";                 //name

                                case 1 :return "Monday:\nFM LAB – A2\nEC LAB – A1\n\nWednesday:\nFM LAB – A1\nEC LAB – A2";                 //tb1

                                case 2 :return "Subject Code : 15MEL57\n\nCREDITS – 00\n\nNumber of Lecture Hrs / Week : 01 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CREATIVITY"))
                        {
                            switch (tb){
                                case 0 :return "CREATIVITY";                 //name

                                case 1 :return "Thursday: 03:00 - 04:45";                 //tb1

                                case 2 :return "";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("EM&E"))
                        {
                            switch (tb){
                                case 0 :return "Engineering Management & Economics";                 //name

                                case 1 :return "MON : 12:05 - 01:00(ME 102)\n\nTUE : 12:05 - 01:00(ME 102)\n\nTHU : 09:00 - 09:55(ME 102)\n\nFRI : 01:55 - 02:50(ME 102)";                 //tb1

                                case 2 :return "Subject Code : 15ME51\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DOM"))
                        {
                            switch (tb){
                                case 0 :return "Dynamics of Machinery";                 //name

                                case 1 :return "MON : 11:10 - 12:05(ME 102)\n\nTUE : 03:55 - 04:45(ME 102)\n\nWED : 11:10 - 12:05(ME 102)\n\nTHU : 01:55 - 02:50(ME 102)\n\nFRI : 09:55 - 10:50(ME 102)";                 //tb1

                                case 2 :return "Subject Code : 15ME52\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7OXB3QzFRanFuMVk";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("TM"))
                        {
                            switch (tb){
                                case 0 :return "Turbo Machines";                 //name

                                case 1 :return "WED : 09:00 - 09:55(ME 102)\n\nWED : 09:55 - 10:50(ME 102)\n\nWED : 03:00 - 03:55(ME 102)\n\nTHU : 11:10 - 12:05(ME 102)\n\nTHU : 03:00 - 03:55(ME 102)";                 //tb1

                                case 2 :return "Subject Code : 15ME53\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7WDdNLXRpQ1VaQVU";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DME-I"))
                        {
                            switch (tb){
                                case 0 :return "Design of Machine Elements – I";                 //name

                                case 1 :return "MON : 09:55 - 10:50(ME 102)\n\nWED : 01:55 - 02:50(ME 102)\n\nTHU : 12:05 - 01:00(ME 102)\n\nFRI : 09:00 - 09:55(ME 102)\n\nFRI : 12:05 - 01:00(ME 102)";                 //tb1

                                case 2 :return "Subject Code : 15ME54\n\nCREDITS – 04\n\nNumber of Lecture Hrs / Week : 03 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7LXBfejJMVFF6TEU";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NTM"))
                        {
                            switch (tb){
                                case 0 :return "Non Traditional Machining";                 //name

                                case 1 :return "TUE : 01:55 - 02:50(ME 102)\n\nWED : 12:05 - 01:00(ME 102)\n\nFRI : 11:10 - 12:05(ME 102)";                 //tb1

                                case 2 :return "Subject Code : 15ME554\n\nCREDITS – 03\n\nNumber of Lecture Hrs / Week : 03\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7MFZ0RHBHMmpRb3c";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("E&E"))
                        {
                            switch (tb){
                                case 0 :return "Energy & Environment";                 //name

                                case 1 :return "MON : 09:00 - 09:55(ME 102)\n\nTUE : 03:00 - 03:55(ME 102)\n\nTHU : 09:55 - 10:50(ME 102)";                 //tb1

                                case 2 :return "Subject Code : 15ME554\n\nCREDITS – 03\n\nNumber of Lecture Hrs / Week : 03\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eTNoc2ZQanI1bnM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("FM/EC LAB"))
                        {
                            switch (tb){
                                case 0 :return "FM / EC LAB";                 //name

                                case 1 :return "Monday:\nFM LAB – A2\nEC LAB – A1\n\nWednesday:\nFM LAB – A1\nEC LAB – A2";                 //tb1

                                case 2 :return "Subject Code : 15MEL57\n\nCREDITS – 00\n\nNumber of Lecture Hrs / Week : 01 + 02\n\nIA Marks :20\n\nExam Marks : 80\n\nExam Hours : 03";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("CREATIVITY"))
                        {
                            switch (tb){
                                case 0 :return "CREATIVITY";                 //name

                                case 1 :return "Thursday: 03:00 - 04:45";                 //tb1

                                case 2 :return "";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }

                        default:return "Data Not Available";
                    }

                } else if (year.equalsIgnoreCase("4th year")) {
                    switch (section){
                        case "A":if (sub.equalsIgnoreCase("ECO"))
                        {
                            switch (tb){
                                case 0 :return "ENGINEERING ECONOMY";                 //name

                                case 1 :return "MON : 09:00 - 09:55(ME 001)\n\nTUE : 01:55 - 02:50(ME 001)\n\nTHU : 09:55 - 10:50(ME 001)\n\nFRI : 12:05 - 01:00(ME 001)";                 //tb1

                                case 2 :return "Subject Code : 10ME71\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ejc3ZWZYVEdHdE0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("VIB"))
                        {
                            switch (tb){
                                case 0 :return "MECHANICAL VIBRATIONS ";                 //name

                                case 1 :return "MON : 12:05 - 01:00(ME 001)\n\nTUE : 12:05 - 01:00(ME 001)\n\nWED : 03:55 - 04:45(ME 001)\n\nTHU : 09:00 - 09:55(ME 001)\n\nFRI : 03:55 - 04:45(ME 001)";                 //tb1

                                case 2 :return "Subject Code : 10ME72\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S1NabGNoN1I1SXM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("H&P"))
                        {
                            switch (tb){
                                case 0 :return "HYDRAULICS & PNEUMATICS";                 //name

                                case 1 :return "MON : 09:55 - 10:50(ME 001)\n\nTUE : 11:10 - 12:05(ME 001)\n\nTHU : 11:10 - 12:05(ME 001)\n\nTHU : 03:00 - 03:55(ME 001)";                 //tb1

                                case 2 :return "Subject Code : 10ME73\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7b3ZwaHk1MkZkRDQ";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("OR"))
                        {
                            switch (tb){
                                case 0 :return "OPERATIONS RESEARCH";                 //name

                                case 1 :return "MON : 01:55 - 02:50(ME 001)\n\nTUE : 09:55 - 10:50(ME 001)\n\nWED : 12:05 - 01:00(ME 001)\n\nTHU : 01:00 - 01:55(ME 001)";                 //tb1

                                case 2 :return "Subject Code : 10ME74\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eW05WnhxY1BjdHc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NCES/TQM"))
                        {
                            switch (tb){
                                case 0 :return "NCES / TQM";                 //name

                                case 1 :return "TUE : 09:00 - 09:55(ME 002/ME 001)\n\nTHU : 01:55 - 02:50(ME 002/ME 001)\n\nTHU : 03:55 - 04:45(ME 002/ME 001)\n\nFRI : 01:55 - 02:50(ME 002/ME 001)";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7d2FTTWJMUTdXbU0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("PLCM/TD"))
                        {
                            switch (tb){
                                case 0 :return "PLCM / TD";                 //name

                                case 1 :return "MON : 11:10 - 12:05(ME 002/ME 001)\n\nMON : 03:00 - 03:55(ME 002/ME 001)\n\nWED : 01:55 - 02:50(ME 002/ME 001)\n\nFRI : 03:00 - 03:55(ME 002/ME 001)";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UlFzS203WENIMjQ";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DESIGN/CIM LAB"))
                        {
                            switch (tb){
                                case 0 :return "DESIGN / CIM LAB";                 //name

                                case 1 :return "Wednesday:\nDESIGN LAB – A2\nCIM LAB – A1\n\nFriday:\nDESIGN LAB – A1\nCIM LAB – A2";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 42\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("APTITUDE"))
                        {
                            switch (tb){
                                case 0 :return "APTITUDE";                 //name

                                case 1 :return "Tuesday: 03:00 - 03:55\nWednesday: 03:00 - 03:55";                 //tb1

                                case 2 :return "Data not available";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        case "B":if (sub.equalsIgnoreCase("ECO"))
                        {
                            switch (tb){
                                case 0 :return "ENGINEERING ECONOMY";                 //name

                                case 1 :return "MON : 09:55 - 10:50(ME 002)\n\nMON : 12:05 - 01:00(ME 002)\n\nWED : 03:00 - 03:55(ME 002)\n\nFRI : 09:55 - 10:50(ME 002)";                 //tb1

                                case 2 :return "Subject Code : 10ME71\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7ejc3ZWZYVEdHdE0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("VIB"))
                        {
                            switch (tb){
                                case 0 :return "MECHANICAL VIBRATIONS ";                 //name

                                case 1 :return "TUE : 09:55 - 10:50(ME 002)\n\nTUE : 11:10 - 12:05(ME 002)\n\nTHU : 03:00 - 03:55(ME 002)\n\nFRI : 09:00 - 09:55(ME 002)\n\nFRI : 11:10 - 12:05(ME 002)";                 //tb1

                                case 2 :return "Subject Code : 10ME72\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7S1NabGNoN1I1SXM";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("H&P"))
                        {
                            switch (tb){
                                case 0 :return "HYDRAULICS & PNEUMATICS";                 //name

                                case 1 :return "MON : 09:00 - 09:55(ME 002)\n\nWED : 11:10 - 12:05(ME 002)\n\nTHU : 01:00 - 01:55(ME 002)\n\nFRI : 12:05 - 01:00(ME 002)";                 //tb1

                                case 2 :return "Subject Code : 10ME73\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7b3ZwaHk1MkZkRDQ";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("OR"))
                        {
                            switch (tb){
                                case 0 :return "OPERATIONS RESEARCH";                 //name

                                case 1 :return "MON : 01:55 - 02:50(ME 002)\n\nTUE : 12:05 - 01:00(ME 002)\n\nWED : 09:00 - 09:55(ME 002)\n\nWED : 09:55 - 10:50(ME 002)";                 //tb1

                                case 2 :return "Subject Code : 10ME74\n\nHours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7eW05WnhxY1BjdHc";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("NCES/TQM"))
                        {
                            switch (tb){
                                case 0 :return "NCES / TQM";                 //name

                                case 1 :return "TUE : 09:00 - 09:55(ME 102/ME 001)\n\nTHU : 01:55 - 02:50(ME 202/ME 001)\n\nTHU : 03:55 - 04:45(ME 202/ME 001)\n\nFRI : 01:55 - 02:50(ME 201/ME 001)";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7d2FTTWJMUTdXbU0";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("PLCM/TD"))
                        {
                            switch (tb){
                                case 0 :return "PLCM / TD";                 //name

                                case 1 :return "MON : 11:10 - 12:05(ME 002/ME 001)\n\nMON : 03:00 - 03:55(ME 002/ME 001)\n\nWED : 01:55 - 02:50(ME 002/TD 001)";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 52\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "https://drive.google.com/open?id=0B-3NN67q8bD7UlFzS203WENIMjQ";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("DESIGN/CIM LAB"))
                        {
                            switch (tb){
                                case 0 :return "DESIGN / CIM LAB";                 //name

                                case 1 :return "Wednesday:\nDESIGN LAB – A2\nCIM LAB – A1\n\nFriday:\nDESIGN LAB – A1\nCIM LAB – A2";                 //tb1

                                case 2 :return "Hours/Week : 04\n\nTotal Hours : 42\n\nIA Marks : 25\n\nExam Hours : 03\n\nExam Marks : 100";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }else if (sub.equalsIgnoreCase("APTITUDE"))
                        {
                            switch (tb){
                                case 0 :return "APTITUDE";                 //name

                                case 1 :return "Tuesday: 03:00 - 03:55\nWednesday: 03:00 - 03:55";                 //tb1

                                case 2 :return "Data not available";                 //tb2

                                case 3 :return "";                 //tb3

                                default:return "Data not available";
                            }

                        }
                        default:return "Data Not Available";
                    }

                }

            }


        }

        return "Data Not Available";
    }
}

package com.smvitm.rajath.smvitm;

/**
 * Created by rajat on 03-08-2017.
 */

public class TimeTableDisplay {
    public static String DiplayTimeTable (String branch,String year,String section,String day,String p)
    {
        if (year.equalsIgnoreCase("1st year")){
            switch (section){
                case "A" : if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "PHYL/WSL";

                        case "p2" : return "PHYL/WSL";

                        case "p3" : return "PHYL/WSL";

                        case "p4" : return "KAN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "EME";

                        case "p7" : return "CIV";

                        case "p8" : return "MAT";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "ELE";

                        case "p2" : return "PHY";

                        case "p3" : return "EME";

                        case "p4" : return "MAT";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CIV";

                        case "p7" : return "ELE";

                        case "p8" : return "PHY";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "PHY";

                        case "p2" : return "ELE";

                        case "p3" : return "MAT";

                        case "p4" : return "CIV";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL/WSL";

                        case "p7" : return "PHYL/WSL";

                        case "p8" : return "PHYL/WSL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "CIV";

                        case "p3" : return "CPH";

                        case "p4" : return "EME";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHY";

                        case "p7" : return "MAT";

                        case "p8" : return "ELE";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CIV";

                        case "p2" : return "EME";

                        case "p3" : return "ELE";

                        case "p4" : return "PHY";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "CPH";

                        case "p8" : return "EME";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                case "B":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "ELE";

                        case "p2" : return "MAT";

                        case "p3" : return "CIV";

                        case "p4" : return "PHY";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "ELE";

                        case "p8" : return "CIV";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "PHYL/WSL";

                        case "p2" : return "PHYL/WSL";

                        case "p3" : return "PHYL/WSL";

                        case "p4" : return "KAN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "EME";

                        case "p7" : return "PHY";

                        case "p8" : return "MAT";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "EME";

                        case "p2" : return "PHY";

                        case "p3" : return "ELE";

                        case "p4" : return "CIV";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "CPH";

                        case "p8" : return "EME";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "ELE";

                        case "p3" : return "EME";

                        case "p4" : return "CIV";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL/WSL";

                        case "p7" : return "PHYL/WSL";

                        case "p8" : return "PHYL/WSL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "PHY";

                        case "p2" : return "EME";

                        case "p3" : return "MAT";

                        case "p4" : return "CPH";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHY";

                        case "p7" : return "CIV";

                        case "p8" : return "ELE";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                case "C":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "CIV";

                        case "p3" : return "EME";

                        case "p4" : return "ELE";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL/WSL";

                        case "p7" : return "PHYL/WSL";

                        case "p8" : return "PHYL/WSL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "ELE";

                        case "p2" : return "EME";

                        case "p3" : return "CIV";

                        case "p4" : return "PHY";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "EME";

                        case "p8" : return "KAN";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "EME";

                        case "p2" : return "ELE";

                        case "p3" : return "MAT";

                        case "p4" : return "CIV";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CPH";

                        case "p7" : return "PHY";

                        case "p8" : return "CIV";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "PHY";

                        case "p2" : return "MAT";

                        case "p3" : return "PHY";

                        case "p4" : return "CPH";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "EME";

                        case "p7" : return "MAT";

                        case "p8" : return "ELE";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CIV";

                        case "p2" : return "MAT";

                        case "p3" : return "ELE";

                        case "p4" : return "PHY";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL/WSL";

                        case "p7" : return "PHYL/WSL";

                        case "p8" : return "PHYL/WSL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                case "D":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "ELE";

                        case "p2" : return "PHY";

                        case "p3" : return "EME";

                        case "p4" : return "CIV";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "ELE";

                        case "p8" : return "PHY";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "CIV";

                        case "p3" : return "PHY";

                        case "p4" : return "EME";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHYL/WSL";

                        case "p7" : return "PHYL/WSL";

                        case "p8" : return "PHYL/WSL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "PHY";

                        case "p2" : return "MAT";

                        case "p3" : return "ELE";

                        case "p4" : return "CPH";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "EME";

                        case "p8" : return "CIV";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "EME";

                        case "p2" : return "ELE";

                        case "p3" : return "CIV";

                        case "p4" : return "MAT";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PHY";

                        case "p7" : return "CPH";

                        case "p8" : return "EME";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "PHYL/WSL";

                        case "p2" : return "PHYL/WSL";

                        case "p3" : return "PHYL/WSL";

                        case "p4" : return "KAN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CIV";

                        case "p7" : return "MAT";

                        case "p8" : return "ELE";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                case "E":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "CHE";

                        case "p8" : return "ELN";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CPL/CHEL";

                        case "p2" : return "CPL/CHEL";

                        case "p3" : return "CPL/CHEL";

                        case "p4" : return "EVS";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "ELN";

                        case "p8" : return "PCD";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "CHE";

                        case "p2" : return "PCD";

                        case "p3" : return "MAT";

                        case "p4" : return "ELN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHE";

                        case "p7" : return "EVS";

                        case "p8" : return "MAT";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "ELN";

                        case "p2" : return "CHE";

                        case "p3" : return "PCD";

                        case "p4" : return "MAT";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "PCD";

                        case "p3" : return "CHE";

                        case "p4" : return "ELN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CPL/CHEL";

                        case "p7" : return "CPL/CHEL";

                        case "p8" : return "CPL/CHEL";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                case "F":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "CHE";

                        case "p2" : return "PCD";

                        case "p3" : return "ELN";

                        case "p4" : return "MAT";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CPL/CHEL";

                        case "p7" : return "CPL/CHEL";

                        case "p8" : return "CPL/CHEL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "ELN";

                        case "p8" : return "EVS";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "CPL/CHEL";

                        case "p2" : return "CPL/CHEL";

                        case "p3" : return "CPL/CHEL";

                        case "p4" : return "EVS";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHE";

                        case "p7" : return "MAT";

                        case "p8" : return "ELN";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "CHE";

                        case "p3" : return "PCD";

                        case "p4" : return "ELN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CHE";

                        case "p7" : return "MAT";

                        case "p8" : return "PCD";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "ELN";

                        case "p2" : return "MAT";

                        case "p3" : return "PCD";

                        case "p4" : return "CHE";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                case "G":if(day.equalsIgnoreCase("Monday")){
                    switch (p){
                        case "p1" : return "ELN";

                        case "p2" : return "MAT";

                        case "p3" : return "PCD";

                        case "p4" : return "CHE";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CAED";

                        case "p7" : return "CAED";

                        case "p8" : return "CAED";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Tuesday")){
                    switch (p){
                        case "p1" : return "MAT";

                        case "p2" : return "ELN";

                        case "p3" : return "EVS";

                        case "p4" : return "PCD";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "CPL/CHEL";

                        case "p7" : return "CPL/CHEL";

                        case "p8" : return "CPL/CHEL";

                        default: return "Data Not Available";
                    }

                }else if (day.equalsIgnoreCase("Wednesday")){
                    switch (p){
                        case "p1" : return "CAED";

                        case "p2" : return "CAED";

                        case "p3" : return "CAED";

                        case "p4" : return "CAED";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "MAT";

                        case "p7" : return "CHE";

                        case "p8" : return "ELN";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Thursday")){
                    switch (p){
                        case "p1" : return "CPL/CHEL";

                        case "p2" : return "CPL/CHEL";

                        case "p3" : return "CPL/CHEL";

                        case "p4" : return "ELN";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "PCD";

                        case "p7" : return "MAT";

                        case "p8" : return "CHE";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Friday")){
                    switch (p){
                        case "p1" : return "CHE";

                        case "p2" : return "PCD";

                        case "p3" : return "CHE";

                        case "p4" : return "MAT";

                        case "p5" : return "Lunch Break";

                        case "p6" : return "ELN";

                        case "p7" : return "EVS";

                        case "p8" : return "MAT";

                        default: return "Data Not Available";
                    }

                }else if(day.equalsIgnoreCase("Saturday")){
                    switch (p){
                        case "p1" : return " ";

                        case "p2" : return " ";

                        case "p3" : return " ";

                        case "p4" : return " ";

                        case "p5" : return " ";

                        case "p6" : return " ";

                        case "p7" : return " ";

                        case "p8" : return " ";

                        default: return "Data Not Available";
                    }

                }


                 default: return "Data Not Available";
            }

        }else {


            if (branch.equalsIgnoreCase("Civil Engineering")) {
                if(year.equalsIgnoreCase("2nd year")){
                    if(day.equalsIgnoreCase("Monday")){
                        switch (p){
                            case "p1" : return "BMC";

                            case "p2" : return "MAT";

                            case "p3" : return "EG";

                            case "p4" : return "BS";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "BMT/BS LAB";

                            case "p7" : return "BMT/BS LAB";

                            case "p8" : return "BMT/BS LAB";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Tuesday")){
                        switch (p){
                            case "p1" : return "MAT";

                            case "p2" : return "BS";

                            case "p3" : return "SOM";

                            case "p4" : return "FM";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "BMT/BS LAB";

                            case "p7" : return "BMT/BS LAB";

                            case "p8" : return "BMT/BS LAB";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Wednesday")){
                        switch (p){
                            case "p1" : return "SOM";

                            case "p2" : return "EG";

                            case "p3" : return "BMC";

                            case "p4" : return "FM";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "MAT";

                            case "p7" : return "BS";

                            case "p8" : return "BS";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Thursday")){
                        switch (p){
                            case "p1" : return "BMT/BS LAB";

                            case "p2" : return "BMT/BS LAB";

                            case "p3" : return "BMT/BS LAB";

                            case "p4" : return "FM";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "SOM";

                            case "p7" : return "EG";

                            case "p8" : return "BMC";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Friday")){
                        switch (p){
                            case "p1" : return "BS";

                            case "p2" : return "SOM";

                            case "p3" : return "EG";

                            case "p4" : return "MAT";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "BMC";

                            case "p7" : return "FM";

                            case "p8" : return "FM";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Saturday")){
                        switch (p){
                            case "p1" : return " ";

                            case "p2" : return " ";

                            case "p3" : return " ";

                            case "p4" : return " ";

                            case "p5" : return " ";

                            case "p6" : return " ";

                            case "p7" : return " ";

                            case "p8" : return " ";

                            default: return "Data Not Available";
                        }

                    }

                }else if (year.equalsIgnoreCase("3rd year")){
                    if(day.equalsIgnoreCase("Monday")){
                        switch (p){
                            case "p1" : return "DRCS";

                            case "p2" : return "AIS";

                            case "p3" : return "AIS";

                            case "p4" : return "SCE";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "AGE";

                            case "p7" : return "AGE";

                            case "p8" : return "APC";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Tuesday")){
                        switch (p){
                            case "p1" : return "C&H/GTE LAB";

                            case "p2" : return "C&H/GTE LAB";

                            case "p3" : return "C&H/GTE LAB";

                            case "p4" : return "SCE";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "APC";

                            case "p7" : return "AGE";

                            case "p8" : return "SCE";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Wednesday")){
                        switch (p){
                            case "p1" : return "DRCS";

                            case "p2" : return "AIS";

                            case "p3" : return "AGE";

                            case "p4" : return "APC";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "C&H/GTE LAB";

                            case "p7" : return "C&H/GTE LAB";

                            case "p8" : return "C&H/GTE LAB";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Thursday")){
                        switch (p){
                            case "p1" : return "APC";

                            case "p2" : return "CA BPD";

                            case "p3" : return "SCE";

                            case "p4" : return "AGE";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "AIS";

                            case "p7" : return "DRCS";

                            case "p8" : return "DRCS";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Friday")){
                        switch (p){
                            case "p1" : return "C&H/GTE LAB";

                            case "p2" : return "C&H/GTE LAB";

                            case "p3" : return "C&H/GTE LAB";

                            case "p4" : return "AIS";

                            case "p5" : return "Lunch Break";

                            case "p6" : return "CA BPD";

                            case "p7" : return "CA BPD";

                            case "p8" : return "CA BPD";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Saturday")){
                        switch (p){
                            case "p1" : return " ";

                            case "p2" : return " ";

                            case "p3" : return " ";

                            case "p4" : return " ";

                            case "p5" : return " ";

                            case "p6" : return " ";

                            case "p7" : return " ";

                            case "p8" : return " ";

                            default: return "Data Not Available";
                        }

                    }

                }else if (year.equalsIgnoreCase("4th year")){
                    if(day.equalsIgnoreCase("Monday")){
                        switch (p){
                            case "p1" : return "C&HM/EE LAB";

                            case "p2" : return "C&HM/EE LAB";

                            case "p3" : return "C&HM/EE LAB";

                            case "p4" : return "E & V";

                            case "p5" : return "Lunch break";

                            case "p6" : return "EE – II";

                            case "p7" : return "DPSC";

                            case "p8" : return "DPSC";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Tuesday")){
                        switch (p){
                            case "p1" : return "DPSC";

                            case "p2" : return "DSS";

                            case "p3" : return "PMC";

                            case "p4" : return "DSS";

                            case "p5" : return "Lunch break";

                            case "p6" : return "E & V";

                            case "p7" : return "E & V";

                            case "p8" : return "EE – II ";

                            default: return "Data Not Available";
                        }

                    }else if (day.equalsIgnoreCase("Wednesday")){
                        switch (p){
                            case "p1" : return "C&HM/EE LAB";

                            case "p2" : return "C&HM/EE LAB";

                            case "p3" : return "C&HM/EE LAB";

                            case "p4" : return "SWM / HGD";

                            case "p5" : return "Lunch break";

                            case "p6" : return "PMC";

                            case "p7" : return "DSS";

                            case "p8" : return "DSS";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Thursday")){
                        switch (p){
                            case "p1" : return "E & V";

                            case "p2" : return "PMC";

                            case "p3" : return "EE – II";

                            case "p4" : return "SWM / HGD";

                            case "p5" : return "Lunch break";

                            case "p6" : return "C&HM/EE LAB";

                            case "p7" : return "C&HM/EE LAB";

                            case "p8" : return "C&HM/EE LAB";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Friday")){
                        switch (p){
                            case "p1" : return "EE – II";

                            case "p2" : return "PMC";

                            case "p3" : return "DPSC";

                            case "p4" : return "SWM / HGD";

                            case "p5" : return "Lunch break";

                            case "p6" : return "DSS";

                            case "p7" : return "SWM/HGD";

                            case "p8" : return "E & V";

                            default: return "Data Not Available";
                        }

                    }else if(day.equalsIgnoreCase("Saturday")){
                        switch (p){
                            case "p1" : return " ";

                            case "p2" : return " ";

                            case "p3" : return " ";

                            case "p4" : return " ";

                            case "p5" : return " ";

                            case "p6" : return " ";

                            case "p7" : return " ";

                            case "p8" : return " ";

                            default: return "Data Not Available";
                        }

                    }
                }







            } else if (branch.equalsIgnoreCase("Computer Science and Engineering")) {

                if(year.equalsIgnoreCase("2nd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "ADE";

                                case "p2" : return "DS";

                                case "p3" : return "USP";

                                case "p4" : return "DMS";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "DS/ADE LAB";

                                case "p7" : return "DS/ADE LAB";

                                case "p8" : return "DS/ADE LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "DMS";

                                case "p2" : return "DS";

                                case "p3" : return "ADE";

                                case "p4" : return "CO";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "USP";

                                case "p7" : return "MAT";

                                case "p8" : return "ADE";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DS";

                                case "p2" : return "MAT";

                                case "p3" : return "CO";

                                case "p4" : return "USP";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "DS/ADE LAB";

                                case "p7" : return "DS/ADE LAB";

                                case "p8" : return "DS/ADE LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DS/ADE LAB";

                                case "p2" : return "DS/ADE LAB";

                                case "p3" : return "DS/ADE LAB";

                                case "p4" : return "DMS";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "MAT";

                                case "p7" : return "DS";

                                case "p8" : return "CO";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "MAT";

                                case "p2" : return "DMS";

                                case "p3" : return "CO";

                                case "p4" : return "USP";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "ADE";

                                case "p7" : return "LANG LAB ";

                                case "p8" : return "LANG LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "DS/ADE LAB";

                                case "p2" : return "DS/ADE LAB";

                                case "p3" : return "DS/ADE LAB";

                                case "p4" : return "DMS";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "USP";

                                case "p7" : return "MAT";

                                case "p8" : return "ADE";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "ADE";

                                case "p2" : return "CO";

                                case "p3" : return "DS";

                                case "p4" : return "MAT";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "DS/ADE LAB";

                                case "p7" : return "DS/ADE LAB";

                                case "p8" : return "DS/ADE LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "MAT";

                                case "p2" : return "USP";

                                case "p3" : return "ADE";

                                case "p4" : return "DS";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "CO";

                                case "p7" : return "DMS";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "CO";

                                case "p2" : return "DS";

                                case "p3" : return "MAT";

                                case "p4" : return "DMS";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "ADE";

                                case "p7" : return "DS";

                                case "p8" : return "USP";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DS/ADE LAB";

                                case "p2" : return "DS/ADE LAB";

                                case "p3" : return "DS/ADE LAB";

                                case "p4" : return "USP";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "LANG LAB";

                                case "p7" : return "DMS";

                                case "p8" : return "CO";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("3rd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "CN/DBMS LAB";

                                case "p2" : return "CN/DBMS LAB";

                                case "p3" : return "CN/DBMS LAB";

                                case "p4" : return "LUNCH BREAK";

                                case "p5" : return "JAVA/ST";

                                case "p6" : return "DBMS";

                                case "p7" : return "ME";

                                case "p8" : return "CN";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "AI";

                                case "p2" : return "FLAT";

                                case "p3" : return "DBMS";

                                case "p4" : return "T";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "CN/DBMS LAB";

                                case "p7" : return "CN/DBMS LAB";

                                case "p8" : return "CN/DBMS LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "FLAT";

                                case "p2" : return "AI";

                                case "p3" : return "CN";

                                case "p4" : return "JAVA/ST";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "ME";

                                case "p7" : return "DBMS";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "CN/DBMS LAB";

                                case "p2" : return "CN/DBMS LAB";

                                case "p3" : return "CN/DBMS LAB ";

                                case "p4" : return "JAVA/ST";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "CN";

                                case "p7" : return "FLAT";

                                case "p8" : return "ME";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DBMS";

                                case "p2" : return "ME";

                                case "p3" : return "FLAT";

                                case "p4" : return "T";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "CN";

                                case "p7" : return "AI";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "CN";

                                case "p2" : return "DBMS";

                                case "p3" : return "ME";

                                case "p4" : return "LUNCH BREAK";

                                case "p5" : return "JAVA/ST";

                                case "p6" : return "CN/DBMS LAB";

                                case "p7" : return "CN/DBMS LAB";

                                case "p8" : return "CN/DBMS LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "AI";

                                case "p2" : return "FLAT";

                                case "p3" : return "ME";

                                case "p4" : return "T";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "DBMS";

                                case "p7" : return "CN";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "FLAT";

                                case "p2" : return "AI";

                                case "p3" : return "DBMS";

                                case "p4" : return "JAVA/ST";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "CN/DBMS LAB";

                                case "p7" : return "CN/DBMS LAB";

                                case "p8" : return "CN/DBMS LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "ME";

                                case "p2" : return "CN";

                                case "p3" : return "FLAT";

                                case "p4" : return "JAVA/ST";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "DBMS";

                                case "p7" : return "T";

                                case "p8" : return "T";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "CN/DBMS LAB";

                                case "p2" : return "CN/DBMS LAB";

                                case "p3" : return "CN/DBMS LAB";

                                case "p4" : return "CN";

                                case "p5" : return "LUNCH BREAK";

                                case "p6" : return "ME";

                                case "p7" : return "AI";

                                case "p8" : return "FLAT";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("4th year")) {
                    switch (section) {
                        case "A":
                            if (day.equalsIgnoreCase("Monday")) {
                                switch (p) {
                                    case "p1":return "AI";

                                    case "p2":return "ECS";

                                    case "p3":return "WEB";

                                    case "p4":return "JAVA/DM";

                                    case "p5":return "LUNCH BREAK";

                                    case "p6":return "OOMD";

                                    case "p7":return "ACA";

                                    case "p8":return "T";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Tuesday")) {
                                switch (p) {
                                    case "p1":return "ACA";

                                    case "p2":return "OOMD";

                                    case "p3":return "AI";

                                    case "p4":return "JAVA/DM";

                                    case "p5":return "LUNCH BREAK";

                                    case "p6":return "ECS";

                                    case "p7":return "WEB";

                                    case "p8":return "T";

                                    default:
                                        return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Wednesday")) {
                                switch (p) {
                                    case "p1":return "NW/WEB LAB";

                                    case "p2":return "NW/WEB LAB";

                                    case "p3":return "NW/WEB LAB";

                                    case "p4":return "LUNCH BREAK";

                                    case "p5":return "OOMD";

                                    case "p6":return "ECS";

                                    case "p7":return "WEB";

                                    case "p8":return "ACA";

                                    default:return "Data Not Available";
                            }

                            } else if (day.equalsIgnoreCase("Thursday")) {
                                switch (p) {
                                    case "p1":return "OOMD";

                                    case "p2":return "AI";

                                    case "p3":return "ECS";

                                    case "p4":return "LUNCH BREAK";

                                    case "p5":return "JAVA/DM";

                                    case "p6":return "NW/WEB LAB";

                                    case "p7":return "NW/WEB LAB";

                                    case "p8":return "NW/WEB LAB";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Friday")) {
                                switch (p) {
                                    case "p1":return "WEB";

                                    case "p2":return "ACA";

                                    case "p3":return "AI";

                                    case "p4":return "LUNCH BREAK";

                                    case "p5":return "JAVA/DM";

                                    case "p6":return "NW/WEB LAB";

                                    case "p7":return "NW/WEB LAB";

                                    case "p8":return "NW/WEB LAB";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Saturday")) {
                                switch (p) {
                                    case "p1":return " ";

                                    case "p2":return " ";

                                    case "p3":return " ";

                                    case "p4":return " ";

                                    case "p5":return " ";

                                    case "p6":return " ";

                                    case "p7":return " ";

                                    case "p8":return " ";

                                    default:return "Data Not Available";
                                }

                            }


                        case "B":
                            if (day.equalsIgnoreCase("Monday")) {
                                switch (p) {
                                    case "p1":return "ECS";

                                    case "p2":return "ACA";

                                    case "p3":return "OOMD";

                                    case "p4":return "JAVA/DM";

                                    case "p5":return "LUNCH BREAK";

                                    case "p6":return "AI";

                                    case "p7":return "WEB";

                                    case "p8":return "T";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Tuesday")) {
                                switch (p) {
                                    case "p1":return "WEB";

                                    case "p2":return "OOMD";

                                    case "p3":return "ECS";

                                    case "p4":return "JAVA/DM";

                                    case "p5":return "LUNCH BREAK";

                                    case "p6":return "AI";

                                    case "p7":return "ACA";

                                    case "p8":return "T";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Wednesday")) {
                                switch (p) {
                                    case "p1":return "NW/WEB LAB";

                                    case "p2":return "NW/WEB LAB";

                                    case "p3":return "NW/WEB LAB";

                                    case "p4":return "LUNCH BREAK";

                                    case "p5":return "OOMD";

                                    case "p6":return "AI";

                                    case "p7":return "ACA";

                                    case "p8":return "ECS";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Thursday")) {
                                switch (p) {
                                    case "p1":return "WEB";

                                    case "p2":return "ECS";

                                    case "p3":return "OOMD";

                                    case "p4":return "LUNCH BREAK";

                                    case "p5":return "JAVA/DM";

                                    case "p6":return "NW/WEB LAB";

                                    case "p7":return "NW/WEB LAB";

                                    case "p8":return "NW/WEB LAB ";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Friday")) {
                                switch (p) {
                                    case "p1":return "AI";

                                    case "p2":return "ACA";

                                    case "p3":return "WEB";

                                    case "p4":return "LUNCH BREAK";

                                    case "p5":return "JAVA/DM";

                                    case "p6":return "NW/WEB LAB";

                                    case "p7":return "NW/WEB LAB";

                                    case "p8":return "NW/WEB LAB";

                                    default:return "Data Not Available";
                                }

                            } else if (day.equalsIgnoreCase("Saturday")) {
                                switch (p) {
                                    case "p1":return " ";

                                    case "p2":return " ";

                                    case "p3":return " ";

                                    case "p4":
                                        return " ";

                                    case "p5":return " ";

                                    case "p6":return " ";

                                    case "p7":return " ";

                                    case "p8":return " ";

                                    default:return "Data Not Available";
                                }

                            }

                        default:
                            return "Data Not Available";
                    }
                }

                } else if (branch.equalsIgnoreCase("Electronics and Communication Engineering")) {

                if(year.equalsIgnoreCase("2nd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "AE";

                                case "p2" : return "EEM";

                                case "p3" : return "NA";

                                case "p4" : return "M3";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "LANGUAGE ";

                                case "p7" : return "DE";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "M3";

                                case "p2" : return "EEM";

                                case "p3" : return "NA";

                                case "p4" : return "EI";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "";

                                case "p7" : return "DE";

                                case "p8" : return "EI";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "NA";

                                case "p2" : return "M3";

                                case "p3" : return "DE";

                                case "p4" : return "AE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "AE/DE LAB";

                                case "p7" : return "AE/DE LAB";

                                case "p8" : return "AE/DE LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DE";

                                case "p2" : return "EI";

                                case "p3" : return "AE";

                                case "p4" : return "NA";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "EEM";

                                case "p7" : return "NA";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "AE/DE LAB";

                                case "p2" : return "AE/DE LAB";

                                case "p3" : return "AE/DE LAB";

                                case "p4" : return "EEM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "M3";

                                case "p7" : return "AE";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "EI";

                                case "p2" : return "EEM";

                                case "p3" : return "DE";

                                case "p4" : return "M3";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "AE";

                                case "p7" : return "LANGUAGE";

                                case "p8" : return "LANGUAGE";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "NA";

                                case "p2" : return "EEM";

                                case "p3" : return "DE";

                                case "p4" : return "EI";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DIP MATHS/EVS";

                                case "p7" : return "DIP MATHS/EVS";

                                case "p8" : return "DIP MATHS/EVS";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "AE/DE LAB";

                                case "p2" : return "AE/DE LAB";

                                case "p3" : return "AE/DE LAB";

                                case "p4" : return "M3";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DE";

                                case "p7" : return "NA";

                                case "p8" : return "EI";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "AE";

                                case "p2" : return "NA";

                                case "p3" : return "M3";

                                case "p4" : return "DE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "EEM";

                                case "p7" : return "AE";

                                case "p8" : return "EI";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "M3";

                                case "p2" : return "NA";

                                case "p3" : return "AE";

                                case "p4" : return "EEM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "AE/DE LAB";

                                case "p7" : return "AE/DE LAB";

                                case "p8" : return "AE/DE LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("3rd year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "DSP/HDL LAB";

                                case "p2" : return "DSP/HDL LAB";

                                case "p3" : return "DSP/HDL LAB";

                                case "p4" : return "OS";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ITC";

                                case "p7" : return "ME";

                                case "p8" : return "C++";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "DSP/HDL LAB";

                                case "p2" : return "DSP/HDL LAB";

                                case "p3" : return "DSP/HDL LAB";

                                case "p4" : return "ME";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSP";

                                case "p7" : return "ITC";

                                case "p8" : return "HDL";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "HDL";

                                case "p2" : return "ME";

                                case "p3" : return "DSP";

                                case "p4" : return "C++";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ITC";

                                case "p7" : return "OS";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "OS";

                                case "p2" : return "C++";

                                case "p3" : return "DSP";

                                case "p4" : return "HDL";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSP/HDL LAB";

                                case "p7" : return "DSP/HDL LAB";

                                case "p8" : return "DSP/HDL LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "ITC";

                                case "p2" : return "HDL";

                                case "p3" : return "OS";

                                case "p4" : return "ME";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSP";

                                case "p7" : return "C++";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "HDL";

                                case "p2" : return "ITC";

                                case "p3" : return "OS";

                                case "p4" : return "DSP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSP/HDL LAB";

                                case "p7" : return "DSP/HDL LAB";

                                case "p8" : return "DSP/HDL LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "ITC";

                                case "p2" : return "ME";

                                case "p3" : return "C++";

                                case "p4" : return "HDL";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DSP/HDL LAB";

                                case "p7" : return "DSP/HDL LAB";

                                case "p8" : return "DSP/HDL LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DSP";

                                case "p2" : return "ITC";

                                case "p3" : return "ME";

                                case "p4" : return "HDL";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OS";

                                case "p7" : return "C++";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DSP/HDL LAB";

                                case "p2" : return "DSP/HDL LAB";

                                case "p3" : return "DSP/HDL LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "C++";

                                case "p6" : return "ME";

                                case "p7" : return "OS";

                                case "p8" : return "DSP";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "HDL";

                                case "p2" : return "DSP";

                                case "p3" : return "OS";

                                case "p4" : return "ITC";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ME";

                                case "p7" : return "C++";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("4th year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "ESD";

                                case "p2" : return "OFC";

                                case "p3" : return "Elec-1";

                                case "p4" : return "IP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "VLSI/PE LAB";

                                case "p7" : return "VLSI/PE LAB";

                                case "p8" : return "VLSI/PE LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "PE";

                                case "p2" : return "CCN";

                                case "p3" : return "IP";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "ESD";

                                case "p6" : return "OFC";

                                case "p7" : return "Elec-1";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "VLSI/PE LAB";

                                case "p2" : return "VLSI/PE LAB";

                                case "p3" : return "VLSI/PE LAB";

                                case "p4" : return "ESD";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CCN";

                                case "p7" : return "PE";

                                case "p8" : return "OFC";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "IP";

                                case "p2" : return "ESD";

                                case "p3" : return "PE";

                                case "p4" : return "Elec-1";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CCN";

                                case "p7" : return "OFC";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "VLSI/PE LAB";

                                case "p2" : return "VLSI/PE LAB";

                                case "p3" : return "VLSI/PE LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "Elec-1";

                                case "p6" : return "CCN";

                                case "p7" : return "PE";

                                case "p8" : return "IP";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "CCN";

                                case "p2" : return "IP";

                                case "p3" : return "Elec-1";

                                case "p4" : return "PE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OFC";

                                case "p7" : return "ESD";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "VLSI/PE LAB";

                                case "p2" : return "VLSI/PE LAB";

                                case "p3" : return "VLSI/PE LAB";

                                case "p4" : return "CCN";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "ESD";

                                case "p7" : return "Elec-1";

                                case "p8" : return "PE";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "ESD";

                                case "p2" : return "CCN";

                                case "p3" : return "OFC";

                                case "p4" : return "IP";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "VLSI/PE LAB";

                                case "p7" : return "VLSI/PE LAB";

                                case "p8" : return "VLSI/PE LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "ESD";

                                case "p2" : return "PE";

                                case "p3" : return "CCN";

                                case "p4" : return "Elec-1";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OFC";

                                case "p7" : return "IP";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "PE";

                                case "p2" : return "OFC";

                                case "p3" : return "IP";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "Elec-1";

                                case "p6" : return "VLSI/PE LAB";

                                case "p7" : return "VLSI/PE LAB";

                                case "p8" : return "VLSI/PE LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }

            } else if (branch.equalsIgnoreCase("Mechanical Engineering")){

                if(year.equalsIgnoreCase("2nd year")){
                    switch (section){
                        case "A":     if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "MOM";

                                case "p2" : return "MCW";

                                case "p3" : return "M3";

                                case "p4" : return "MOM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MCW";

                                case "p7" : return "BTD";

                                case "p8" : return "MSM";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "M3";

                                case "p2" : return "BTD";

                                case "p3" : return "MCW";

                                case "p4" : return "BTD";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CAMD";

                                case "p7" : return "CAMD";

                                case "p8" : return "CAMD";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "MT/F&F LAB";

                                case "p2" : return "MT/F&F LAB";

                                case "p3" : return "MT/F&F LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "BTD";

                                case "p6" : return "MCW";

                                case "p7" : return "MSM";

                                case "p8" : return "MOM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "CAMD";

                                case "p2" : return "CAMD";

                                case "p3" : return "CAMD";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "BTD";

                                case "p6" : return "M3";

                                case "p7" : return "MOM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "MSM";

                                case "p2" : return "MOM";

                                case "p3" : return "MSM";

                                case "p4" : return "M3";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MT/F&F LAB";

                                case "p7" : return "MT/F&F LAB";

                                case "p8" : return "MT/F&F LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return "";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "MT/F&F LAB";

                                case "p2" : return "MT/F&F LAB";

                                case "p3" : return "MT/F&F LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "MOM";

                                case "p6" : return "M3";

                                case "p7" : return "MCW";

                                case "p8" : return "MSM";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "MOM";

                                case "p2" : return "MCW";

                                case "p3" : return "M3";

                                case "p4" : return "MCW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MOM";

                                case "p7" : return "BTD";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "MOM";

                                case "p2" : return "BTD";

                                case "p3" : return "MSM";

                                case "p4" : return "M3";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "CAMD";

                                case "p7" : return "CAMD";

                                case "p8" : return "CAMD";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "M3";

                                case "p2" : return "BTD";

                                case "p3" : return "MSM";

                                case "p4" : return "MCW";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "MT/F&F LAB";

                                case "p7" : return "MT/F&F LAB";

                                case "p8" : return "MT/F&F LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "CAMD";

                                case "p2" : return "CAMD";

                                case "p3" : return "CAMD";

                                case "p4" : return "MSM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "BTD";

                                case "p7" : return "MOM";

                                case "p8" : return "BTD";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("3rd year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "FM/EC LAB";

                                case "p2" : return "FM/EC LAB";

                                case "p3" : return "FM/EC LAB";

                                case "p4" : return "DME-I";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "EM&E";

                                case "p7" : return "DOM";

                                case "p8" : return "E&E";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "DME-I";

                                case "p2" : return "TM";

                                case "p3" : return "NTM";

                                case "p4" : return "TM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "EM&E";

                                case "p7" : return "DOM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "TM";

                                case "p2" : return "NTM";

                                case "p3" : return "DME-I";

                                case "p4" : return "E&E";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "FM/EC LAB";

                                case "p7" : return "FM/EC LAB";

                                case "p8" : return "FM/EC LAB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DME-I";

                                case "p2" : return "DOM";

                                case "p3" : return "EM&E";

                                case "p4" : return "TM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "E&E";

                                case "p7" : return "CREATIVITY";

                                case "p8" : return "CREATIVITY";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DOM";

                                case "p2" : return "DME-I";

                                case "p3" : return "DOM";

                                case "p4" : return "EM&E";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "NTM";

                                case "p7" : return "TM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "E&E";

                                case "p2" : return "DME-I";

                                case "p3" : return "DOM";

                                case "p4" : return "EM&E";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "FM/EC LAB";

                                case "p7" : return "FM/EC LAB";

                                case "p8" : return "FM/EC LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "FM/EC LAB";

                                case "p2" : return "FM/EC LAB";

                                case "p3" : return "FM/EC LAB";

                                case "p4" : return "EM&E";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "NTM";

                                case "p7" : return "E&E";

                                case "p8" : return "DOM";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "TM";

                                case "p2" : return "TM";

                                case "p3" : return "DOM";

                                case "p4" : return "NTM";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DME-I";

                                case "p7" : return "TM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "EM&E";

                                case "p2" : return "E&E";

                                case "p3" : return "TM";

                                case "p4" : return "DME-I";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DOM";

                                case "p7" : return "TM";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DME-I";

                                case "p2" : return "DOM";

                                case "p3" : return "NTM";

                                case "p4" : return "DME-I";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "EM&E";

                                case "p7" : return "CREATIVITY";

                                case "p8" : return "CREATIVITY";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }else if (year.equalsIgnoreCase("4th year")){
                    switch (section){
                        case "A":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "ECO";

                                case "p2" : return "H&P";

                                case "p3" : return "PLCM/TD";

                                case "p4" : return "VIB";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OR";

                                case "p7" : return "PLCM/TD";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "NCES/TQM";

                                case "p2" : return "OR";

                                case "p3" : return "H&P";

                                case "p4" : return "VIB";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "EGO";

                                case "p7" : return "APTITUDE";

                                case "p8" : return "APTITUDE";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "DESIGN / CIM LAB";

                                case "p2" : return "DESIGN / CIM LAB";

                                case "p3" : return "DESIGN / CIM LAB";

                                case "p4" : return "OR";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PLCM/TD";

                                case "p7" : return "APTITUDE";

                                case "p8" : return "VIB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "VIB";

                                case "p2" : return "ECO";

                                case "p3" : return "H&P";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "OR";

                                case "p6" : return "NCES/TQM";

                                case "p7" : return "H&P";

                                case "p8" : return "NCES/TQM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "DESIGN / CIM LAB";

                                case "p2" : return "DESIGN / CIM LAB";

                                case "p3" : return "DESIGN / CIM LAB";

                                case "p4" : return "ECO";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "NCES/TQM";

                                case "p7" : return "PLCM/TD";

                                case "p8" : return "VIB";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }


                        case "B":  if(day.equalsIgnoreCase("Monday")){
                            switch (p){
                                case "p1" : return "H&P";

                                case "p2" : return "ECO";

                                case "p3" : return "PLCM/TD";

                                case "p4" : return "ECO";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "OR";

                                case "p7" : return "PLCM/TD";

                                case "p8" : return "APTITUDE";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Tuesday")){
                            switch (p){
                                case "p1" : return "NCES/TQM";

                                case "p2" : return "VIB";

                                case "p3" : return "VIB";

                                case "p4" : return "OR";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "DESIGN / CIM LAB";

                                case "p7" : return "DESIGN / CIM LAB";

                                case "p8" : return "DESIGN / CIM LAB";

                                default: return "Data Not Available";
                            }

                        }else if (day.equalsIgnoreCase("Wednesday")){
                            switch (p){
                                case "p1" : return "OR";

                                case "p2" : return "OR";

                                case "p3" : return "H&P";

                                case "p4" : return "APTITUDE";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "PLCM/TD";

                                case "p7" : return "ECO";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Thursday")){
                            switch (p){
                                case "p1" : return "DESIGN / CIM LAB";

                                case "p2" : return "DESIGN / CIM LAB";

                                case "p3" : return "DESIGN / CIM LAB";

                                case "p4" : return "Lunch Break";

                                case "p5" : return "H&P";

                                case "p6" : return "NCES/TQM";

                                case "p7" : return "VIB";

                                case "p8" : return "NCES/TQM";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Friday")){
                            switch (p){
                                case "p1" : return "VIB";

                                case "p2" : return "ECO";

                                case "p3" : return "VIB";

                                case "p4" : return "H&P";

                                case "p5" : return "Lunch Break";

                                case "p6" : return "NCES/TQM";

                                case "p7" : return "PLCM/TD";

                                case "p8" : return "";

                                default: return "Data Not Available";
                            }

                        }else if(day.equalsIgnoreCase("Saturday")){
                            switch (p){
                                case "p1" : return " ";

                                case "p2" : return " ";

                                case "p3" : return " ";

                                case "p4" : return " ";

                                case "p5" : return " ";

                                case "p6" : return " ";

                                case "p7" : return " ";

                                case "p8" : return " ";

                                default: return "Data Not Available";
                            }

                        }

                        default: return "Data Not Available";
                    }
                }

            }
        }
        return "Data Not Available";
    }
}

class Solution {
    public String reformatDate(String date) {
        StringBuilder sb=new StringBuilder();
        int len=date.length();
        String months[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String year=date.substring(len-4,len);
        String month=date.substring(len-8,len-5);
        int mon=0;
        for(int i=0;i<12;i++){
            if(months[i].equals(month)){
                mon=i+1;break;
            }
        }
        String dayy=date.substring(0,date.indexOf(' '));
        String day=dayy.replaceAll("[A-za-z]","");
        sb.append(year).append("-");
        sb.append(mon<10?"0":"").append(mon).append("-");
        sb.append(Integer.parseInt(day)<10?"0":"").append(day);
        return sb.toString();
    }
}
package lecture2;

public class Account {

    public int checkStudentID(String studentID, String[][] accountInfo){
        for(int i=0;i<accountInfo.length;i++){
            if(accountInfo[i][0].equals(studentID)){
                return i;
            }
        }
        return -1;
    }

    public boolean checkPassword(String password, String[][] accountInfo, int index){
        return password.equals(accountInfo[index][1]);

    }
}

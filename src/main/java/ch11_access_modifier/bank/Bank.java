package ch11_access_modifier.bank;


public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

// Setter
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        // 0원 초과가 입금이 가능해야하므로
        if(balance <= 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance; // 초기 잔액 세팅이기 때문에 입금을 얘로 이루어질 수 x
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber > 0 && pinNumber < 9999) {
            this.pinNumber = pinNumber;
        }
    }


//    Getter
    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    // 강사님은 if를 따로따로 썼음 깃허브 확인
    public void deposit(int amount, int inputPin) {
        if(inputPin != this.pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        } else if(amount <= 0) {   // && inputPin == this.pinNumber 이게 굳이 필요없음
            System.out.println("불가능한 입력금액입니다.");
            return;
        }
        balance += amount;
        System.out.println(amount + "가 입금되었습니다. 현재 잔액 " + this.balance + "원");
    }

    // 출금  // 강사님은 if를 따로따로 썼음 깃허브 확인
    public void withdraw(int amount, int inputPin) {
        if(inputPin != this.pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        } else if(amount <= 0) {
            System.out.println("불가능한 입력금액입니다.");
            return;
        } else if((this.balance - amount) < 0) {
                System.out.println("출금 불가입니다.");
                return;
            }
        balance -= amount;
        System.out.println(amount + "가 출금되었습니다. 현재 잔액 " + this.balance + "원");

    }


    public void showAccountInfo() {
        System.out.println("계좌번호 : " + accountNum + "\n계좌소유자 : " + accountHolder
                            + "\n현재잔액 : " + balance + "\n");
    }
}


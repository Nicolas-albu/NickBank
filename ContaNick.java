package NickBank;

public class ContaNick {
    private static int totalDeContas;
    private String titular;
    private int numeroConta;
    private float saldo;
    private boolean isContaBloqueada;

    //Interface
    public boolean saca(float valorSaque){
        if(valorSaque > this.saldo){
            return false;
        } else{
            this.saldo -= valorSaque;
            return true;
        }
    }
    public void deposito(float valorDeposito){
        this.saldo += valorDeposito;
    }

    public void desbloqueiaConta(){
        isContaBloqueada = true;
    }

    public void bloqueiaConta(){
        isContaBloqueada = false;
    }

    //Getters
    public int getTotalDeContas(){
        return ContaNick.totalDeContas;
    }

    public String getTitular(){
        return this.titular;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public boolean getIsContaBloqueada(){
        return this.isContaBloqueada;
    }

    ContaNick(String titular, int numeroConta, float saldo, boolean isContaBloqueada){
        ContaNick.totalDeContas++;
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.isContaBloqueada = isContaBloqueada;
    }

}

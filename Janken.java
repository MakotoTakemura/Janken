//以下解答
int coma = rand.nextInt(3);
int comb = rand.nextInt(3);

String chinchins[] = {"グー","チョキ","パー"};

System.out.println("コンピューターA:" + chinchins[coma]);
System.out.println("コンピューターB:" + chinchins[comb]);

if(coma == comb){
    System.out.println("あいこ")
} else if(coma == 0 && comb == 1 || coma == 1 && comb == 2 || coma == 2 && comb == 0){
    System.out.println("コンピューターAの勝ち")；
} else{
    System.out.println("コンピューターの勝ち")；
}
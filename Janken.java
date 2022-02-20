// String chinchinsに関しては好きな名称に変更可能。ただし、数字が先頭にきたり日本語にするのはNG
// OK: String Oppais NG: String 3janken NG: String 出し手
// 自然数を表す int名も任意に命名可能 例:computerX, computerY
// 全角スペースが1個でも混じるとバグる可能性あり
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
    System.out.println("コンピューターAの負け")；
}


package day27abstraction;

public interface Ac {

    public abstract void cool();


    /*
    1) Bir interface i bir class in parent i yapmak icin "implements" keyword unu kullaniriz
    2) Java parent lar class oldugunda multiple parent a musade etmez ama
    multiple parent a ihtiyac duyariz.
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir calss icin cokul bir interface parent olusturulabilir
    3) Interface lerin icine concrete method konulamaz cunku concrete method da
    body vardir. body o methodun isi nasil yapacagini belirtir .isin nasil yapilacagi
    bir cok detay icerir ve bu child class larda
    kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi söyleyip
    nasil yapilacagini child a birakirsaniz child class in kafa karisikligini
    engellemis olursunuz.
     */

}

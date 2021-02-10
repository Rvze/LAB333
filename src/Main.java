public class Main {
    public static void main(String[] args) {
        Item ship = new Item("ship");
        ship.setHp((int)(Math.random()*10));
        Sea sea = new Sea("Sea");
        sea.destruct(ship, DegreeOfBroke.DESTRUCTS);
        Item belt = new Item("belt");
        belt.setHp((int) (Math.random() * 10));
        sea.destruct(belt, DegreeOfBroke.CORRODES);

        Item knife = new Item("knife");
        knife.setHp((int)(Math.random()*4+3));
        Snork snork = new Snork("Snork", TypeOfPerson.COLLECTOR);
        snork.toTakeKnife(knife);

        Item bp = new Item("backpack");
        Line line = new Line("line");
        line.setHp((int)(Math.random()*4+3));
        bp.setBpSpace((int)(Math.random()*5+2));
        for (int i = 0; i < 6; i++) {
            if (snork.mine(line)) {
                snork.getOre(line, snork.getKnife(),bp);
            }
        }

        snork.snorkInventory();
        snork.changeTypeOfPerson(TypeOfPerson.GOLDMINER);

        Sniff sniff = new Sniff("Sniff", TypeOfPerson.COLLECTOR);
        sniff.wearItem(belt);
        sniff.getType();
    }
}

//    Снорк ковырнул полоску ножом.
//        В лапу ему упала золотая крупинка.
//        Он отколупнул еще и еще.
//        Словно в горячке выковыривал он куски один другого крупнее и скоро забыл обо всем на свете, кроме вскрытых молнией золотых жил.
//        Теперь он уже был не какой-то там собиратель выброшенных морем обломков кораблекрушения, а настоящий золотоискатель!
//        Снифф же тем временем сделал совсем немудреное открытие, но и оно подарило ему немудреную, а все же радость:
//            он нашел пробковый пояс -- пояс, отчасти разъеденный морской водой, но пришедшийся ему как раз впору.


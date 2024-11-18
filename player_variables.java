//
// I create the blueprints for the units here
public class player_variables(){
    static int ipcs = 12;
    static int income = 12;
}

public class unit(){
    String unitName;
    static int unitCost;
    static int unitMove;
    static int unitAttack;
    static int unitDefense;
public unit(String Name, int Cost, int Move, int Attack, int Defense;){
    this.unitName = Name;
    this.unitCost = Cost;
    this.unitMove = Move;
    this.unitAttack = Attack;
    this.unitDefense = Defense;
}
}
public static purchase_units(){
    
}
public static void combat_move(){

}
public static void conduct_combat(){
    
}

public static void non_combat_move(){

}
public static void mobilize_new_units(){

}
public static collect_income(){
    ipcs + income;
}

public static void main(String[] args){
    unit infantry = new unit("infantry", 3, 1, 1, 2);
    unit tank = new unit("tank", 6, 2, 3, 3);
    unit fighter = new unit("fighter", 10, 4, 3, 4);
    unit bomber = new unit("bomber", 12, 6, 4, 1);
    unit submarine = new unit("submarine", 6, 2, 2, 1);
    unit transport = new unit("transport", 7, 2, 0, 0);
    unit destroyer = new unit("destroyer", 8, 2, 2, 2);
    unit aircraft_carrier = new unit("aircraft carrier", 12, 2, 1, 2);
    unit battleship = new unit("battleship", 16, 2, 4, 4);
}
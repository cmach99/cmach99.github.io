function User(){

    this.accName1 =  '';
    this.accName2 = '';

    this. accBalance = 10000;

    this.financialTransaction = function(targetAcc){
      targetAcc.accBalance += 250;
        console.log(this.accName1 +' has deposited money to '+ targetAcc.accName2);

    };
}

// create two users
var Craig = new User();
var Mach = new User();

//set the names of the users
 Craig.accName1 = 'Craig Machingura';
 Mach.accName2 = 'Mach Attack';


Craig.financialTransaction(Mach);

console.log('Craig Machingura has a balance of £' + Craig.accBalance);
console.log(' Mach Attack has a balance of £' + Mach.accBalance);

//Using the prototype functionality

User.prototype.withdrawal = function(targetAcc){
    targetAcc.accBalance -= 375;
    console.log(this.accName1 +' has given money to '+ targetAcc.accName2);

};

Craig.withdrawal(Mach);

console.log('Craig Machingura has a balance of £' + Mach.accBalance);




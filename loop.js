// for(let i = 0; i < 5; i++){
//     console.log("in loop: ", i);
// }
// console.log("loop finished");

const names = ["shaun", "mario", "luigi"];

// for(let i = 0; i < names.length; i++){
//     // console.log(names[i]);
//     let html = `<div>${names[i]}</div>`;
//     console.log(html);
// }

// let i = 0;
// while(i < names.length){
//     console.log(names[i]);
//     i++;
// }
// let age = 25;

// if(age > 20){
//     console.log("you are over 20 years old");
// }

// if(names.length > 2){
//     console.log("that's a lot of names");
// }

// const password = "pass";

// if(password.length >= 12){
//     console.log("that password is mighty strong");
// } else if(password.length >= 8){
//     console.log("that password is long enough");
// } else {
//     console.log("password is not long enough");
// }

// const password = "p@ss12345678" ;

// if(password.length >= 12 && password.includes("@")){
//     console.log("that password is mighty strong");
// } else if(password.length >= 8 || password.includes("@") && password.length >= 5){
//     console.log("that password is long enough");
// } else {
//     console.log("password is not long enough");
// }

// let user = false;

// if(!user){
//     console.log("you are logged in");
// }

// console.log(!true);
// console.log(!false);

// const score = [40, 20, 33, 0, 31, 100, 99, 70];

// for(let i = 0; i < score.length; i++){

//     if(score[i] === 0){
//         continue;
//     }

//     console.log("your score: ", score[i]);

//     if(score[i] === 100){
//         console.log("congrats, you got the top score!");
//         break;
//     }
// }

// const grade = "A";

// switch(grade){
//     case "A":
//         console.log("you got an A!");
//         break;
//     case "B":
//         console.log("you got an B!");
//         break;
//     case "C":
//         console.log("you got an C!");
//         break;
//     case "D":
//         console.log("you got an D!");
//         break;
//     case "E":
//         console.log("you got an E!");
//         break;
//     default:
//         console.log("not a valid grade");
// }

let age = 30;

if(true){
    let age = 40;
    let name = "shaun";
    console.log("inside 1st code block: ", age, name);

    if(true){
        let age = 50;
        console.log("inside 2nd code block: ", age);
        var test = "hello";
    }
}

console.log("outside code block: ", age, name, test);
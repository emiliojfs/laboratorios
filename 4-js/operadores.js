//operadores matematicos
let numero1 = 20;
let numero2 = 10;

let suma = numero1 + numero2;
let resta = numero1 - numero2;
let multiplicacion = numero1 * numero2;
let division = numero1 / numero2;
let resto = numero2 % numero1;

console.log(suma);
console.log(resta);
console.log(multiplicacion);
console.log(division);
console.log(resto);
console.log('--------------------');
//operador de asignación

let numerox = 100;
numerox +=5;
console.log(numerox);

numerox -=10;
console.log(numerox);

numerox *=10;
console.log(numerox);
console.log('--------------------');
//operador de comparacion

let precio_casa = 1500;
let precio_departamento = 1500;
let precio_terreno = '1500';
let comparacion1;
let comparacion2;
//igualdad estricta
comparacion1 = precio_casa === precio_departamento;
console.log(comparacion1);
//igualdad no estricta; string pueden ser tomados como numero
comparacion2 = precio_casa == precio_terreno;
console.log(comparacion2);
console.log('--------------------');
//mayor o menor

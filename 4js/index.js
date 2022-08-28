//variables->var(deprecado) let (recomendado) //constante->const
//declarar variable
let variable="Soy un texto cualquiera en una variable del pasado";
console.log(variable);
//mutabilidad
variable ="Soy un texto cualquiera en la misma variable del fututo";
console.log(variable);
// tipos de datos en JS (String,Boolean,Null,Number,Undefined,Object)
let miBoolean=true;
let tuBoolean=false;

let miNumero = 0;
let tunumero =12;

console.log(variable, miBoolean, tuBoolean, miNumero, tunumero);

let undef;
console.log(undef);

let nulo=null;
console.log(nulo);

//objetos = es una agrupación de datos que preferentemente tienen relacion entre si

//objeto vacío
const objetoVacio = {};

//objeto comun
const primerObjeto = {
    unNumero: 12,
    unString: 'cadena de caracteres',
    unaCondicion: true
};
console.log(primerObjeto);
console.log(primerObjeto.unNumero);

//arreglo
const arregloVacio = [];
const miArreglo = [1,2,'Hola','Adios',primerObjeto];

console.log(arregloVacio);
console.log(miArreglo);

miArreglo.push(5);
console.log(miArreglo);

arregloVacio.push(4);
arregloVacio.push(453);
arregloVacio.push(56);
arregloVacio.push(78);

console.log(arregloVacio);

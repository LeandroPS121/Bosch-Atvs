import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GetDataService {

  constructor() { }

  //Categorias de produtos
  categoriesData = [
    {
      id: 1000,
      img: 'imagens/catalogo/pao01.png',
      name: 'Pães',
      code: 'paes',
    },
    {
      id: 1001,
      img: 'imagens/catalogo/doce01.png',
      name: 'Doces',
      code: 'doces',
    },
    {
      id: 1002,
      img: 'imagens/catalogo/salgado01.png',
      name: 'Salgados',
      code: 'salgados',
    },
    {
      id: 1003,
      img: 'imagens/catalogo/bebida01.png',
      name: 'Bebidas',
      code: 'bebidas',
    },
  ];

  //Produtos de fato
  productData = [
    {
      id: 1,
      img: 'imagens/catalogo/pao01.png',
      name: 'Pão de Forma.',
      desc: 'O pão recomendado para tomar café com a família',
      preco: '3',
      categoria: 'paes',
    },
    {
      id: 2,
      img: 'imagens/catalogo/pao02.png',
      name: 'Pão Francês',
      desc: 'Clássico.',
      preco: '2 Kg',
      categoria: 'paes',
    },
    {
      id: 3,
      img: 'imagens/catalogo/pao03.png',
      name: 'Croissant',
      desc: 'Não sou um pão, mas estou aqui mesmo assim.',
      preco: '3',
      categoria: 'paes',
    },
    {
      id: 4,
      img: 'imagens/catalogo/doce01.png',
      name: 'Bolo de Frutas',
      desc: 'Equilíbrio entre o saudável e a diabete.',
      preco: '20',
      categoria: 'doces',
    },
    {
      id: 5,
      img: 'imagens/catalogo/doce02.png',
      name: 'Bolo de Chantily',
      desc: 'Extremamente saboroso.',
      preco: '18',
      categoria: 'doces',
    },
    {
      id: 6,
      img: 'imagens/catalogo/doce03.png',
      name: 'Bolo de Chocolate',
      desc: 'Sempre tem que ter no café da tarde',
      preco: '15',
      categoria: 'doces',
    },
    {
      id: 7,
      img: 'imagens/catalogo/salgado01.png',
      name: 'Coxinha',
      desc: 'Simplesmente coxinha.',
      preco: '4',
      categoria: 'salgados',
    },
    {
      id: 8,
      img: 'imagens/catalogo/salgado02.png',
      name: 'Risoles',
      desc: 'A versão pirata do pastel.',
      preco: '2',
      categoria: 'salgados',
    },
    {
      id: 9,
      img: 'imagens/catalogo/salgado03.png',
      name: 'Bolinho de Carne',
      desc: 'Vai bem com ketchup.',
      preco: '3',
      categoria: 'salgados',
    },
    {
      id: 10,
      img: 'imagens/catalogo/bebida01.png',
      name: 'Suco de Laranja',
      desc: 'Juice of laranja.',
      preco: '4',
      categoria: 'bebidas',
    },
    {
      id: 11,
      img: 'imagens/catalogo/bebida02.png',
      name: 'Fanta Laranja',
      desc: 'Fanta of laranja.',
      preco: '5',
      categoria: 'bebidas',
    },
    {
      id: 12,
      img: 'imagens/catalogo/bebida03.png',
      name: 'Água',
      desc: 'Water of lar.. Water.',
      preco: '1',
      categoria: 'bebidas',
    },
  ];

  //Detalhes produto

}

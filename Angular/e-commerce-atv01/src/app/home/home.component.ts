import { Component, OnInit } from '@angular/core';
import { NavbarComponent } from "../navbar/navbar.component";
import { GetDataService } from '../service/get-data.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NavbarComponent, CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})

export class HomeComponent implements OnInit{

  // Lista das imagens para o carrossel

  bannerImgs = [
    {
      id: 1,
      img: 'imagens/catalogo/pao01.png',

    },
    {
      id: 2,
      img: 'imagens/catalogo/pao02.png',
    },
    {
      id: 3,
      img: 'imagens/catalogo/pao03.png',
    },
    {
      id: 4,
      img: 'imagens/catalogo/doce01.png',
    },
    {
      id: 5,
      img: 'imagens/catalogo/doce02.png',
    },
    {
      id: 6,
      img: 'imagens/catalogo/doce03.png',
    },
  ];

  getCategoriesData: any;
  getSalgadoProductData: any=[];

  constructor(private getData:GetDataService){}

  ngOnInit(): void {
    this.getCategoriesData = this.getData.categoriesData;

    this.getData.productData.filter((ele:any)=>{
      if(ele.categoria == 'salgados'){
        this.getSalgadoProductData.push(ele);
      }
    });
  }
}

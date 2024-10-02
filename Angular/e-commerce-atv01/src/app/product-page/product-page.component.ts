import { Component, OnInit } from '@angular/core';
import { NavbarComponent } from "../navbar/navbar.component";
import { GetDataService } from '../service/get-data.service';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-page',
  standalone: true,
  imports: [NavbarComponent, CommonModule],
  templateUrl: './product-page.component.html',
  styleUrl: './product-page.component.css'
})
export class ProductPageComponent implements OnInit{

  getParamValue:any;
  getProductData:any=[];
  filterProductData:any=[];
  constructor(private route:ActivatedRoute, private getData: GetDataService){}

  ngOnInit(): void {
    this.getParamValue = this.route.snapshot.paramMap.get('name');

    this.getData.productData.filter((ele:any)=>{
      if(ele.categoria == this.getParamValue){
        this.getProductData.push(ele);
        this.filterProductData.push(ele);
      }
    });
  }
}

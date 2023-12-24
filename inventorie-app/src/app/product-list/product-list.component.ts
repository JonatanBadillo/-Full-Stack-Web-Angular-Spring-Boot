import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html'
})
export class ProductListComponent {
  products: Product[];

  constructor(private productService: ProductService){}
  
  ngOnInit(){
    //Cargamos los productos
    this.obtainProducts();
  }

  private obtainProducts(){
    // Consumir los datos del observable (suscribirnos)
    this.productService.obtainProductsList().subscribe(
      (data => {
        this.products = data;
      })
    );
  }
}

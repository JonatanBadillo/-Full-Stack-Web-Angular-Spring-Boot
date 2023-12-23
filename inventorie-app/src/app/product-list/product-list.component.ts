import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [],
  templateUrl: './product-list.component.html',
})
export class ProductListComponent {
  products: Product[];

  constructor(private productService: ProductService){}

  ngOnInit(){
    // load all products
    this.obtainProducts();
  }

  private obtainProducts(){
    // consume data of observable
    this.productService.obtainProductsList().subscribe(
      (data => {
        this.products = data;
      })
    );
  }
}

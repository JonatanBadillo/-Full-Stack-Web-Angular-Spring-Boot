import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html'
})
export class ProductListComponent implements OnInit {
  products: Product[];

  constructor(private productService: ProductService) {}

  ngOnInit() {
    // load all products
    this.obtainProducts();
  }

  private obtainProducts() {
    // consume data of observable
    this.productService.obtainProductsList().subscribe(
      (data => {
        this.products = data;
      })
    );
  }
}

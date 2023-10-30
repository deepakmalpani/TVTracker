import { Component } from '@angular/core';
import { AuthService } from '@auth0/auth0-angular';

@Component({
  selector: 'app-signup-button',
  templateUrl: './signup-button.component.html',
  styleUrls: ['./signup-button.component.css']
})
export class SignupButtonComponent {

  constructor(public auth : AuthService) {}

  loginWithRedirect() : void {
    this.auth.loginWithRedirect({
      authorizationParams : {
        screen_hint : 'signup'
      }
    });
  }
}

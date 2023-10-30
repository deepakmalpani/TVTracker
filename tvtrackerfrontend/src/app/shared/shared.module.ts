import { NgModule } from "@angular/core";
import { AuthenticationButtonComponent } from "./authentication-button/authentication-button.component";
import { LoginButtonComponent } from "./login-button/login-button.component";
import { LogoutButtonComponent } from "./logout-button/logout-button.component";
import { SignupButtonComponent } from "./signup-button/signup-button.component";
import { CommonModule } from "@angular/common";
import { AuthNavComponent } from './auth-nav/auth-nav.component';
import { RouterModule } from "@angular/router";

@NgModule({
    declarations : [
        AuthenticationButtonComponent,
        LoginButtonComponent,
        LogoutButtonComponent,
        SignupButtonComponent,
        AuthNavComponent
    ],
    imports: [
        CommonModule,
        RouterModule
    ],
    exports:[
        AuthNavComponent
    ]
})
export class SharedModule {}
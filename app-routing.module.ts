import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './pages/register/register.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './pages/login/login.component';
import { UserDashboardComponent } from './pages/user-dashboard/user-dashboard.component';
const routes: Routes = [
{
  path:'register',
  component: RegisterComponent,
  pathMatch: 'full',
},

{
  path:'login',
  component: LoginComponent,
  pathMatch: 'full',
},

{
  path:'navbar',
  component:NavbarComponent,
  pathMatch:'full',
},

{
  path:'userdashboard',
  component:UserDashboardComponent,
},
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { default as data } from '../../auth_config.json';

export const environment = {
  production: false,
  auth: {
    domain : data.domain,
    clientId : data.clientId,
    redirectUri: "http://localhost:4200",
  },
};
import { USER_ROLE_ENUM } from "@/constant/accessEnum";

export const userRoutes = [
  {
    path: "/user/info",
    name: "个人信息",
    icon: '<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1024 1024" data-v-ea893728=""><path fill="currentColor" d="M512 512a192 192 0 1 0 0-384 192 192 0 0 0 0 384m0 64a256 256 0 1 1 0-512 256 256 0 0 1 0 512m320 320v-96a96 96 0 0 0-96-96H288a96 96 0 0 0-96 96v96a32 32 0 1 1-64 0v-96a160 160 0 0 1 160-160h448a160 160 0 0 1 160 160v96a32 32 0 1 1-64 0"></path></svg>',
    reward: "/info",
    meta: {
      access: USER_ROLE_ENUM.USER,
      hideInMenu: false,
    },
  },
  {
    path: "/user/logout",
    name: "退出登录",
    icon: '<i class="iconfont icon-drop-window"></i>',
    meta: {
      access: USER_ROLE_ENUM.USER,
    },
  },
];

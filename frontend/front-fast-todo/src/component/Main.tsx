import React from "react";
import { Outlet } from "react-router-dom";

const Main = () => {
  return (
    <div>
      Main Component
      {/* 여기다가 메뉴 넣어주기 */}
      <Outlet />
    </div>
  );
};

export default Main;

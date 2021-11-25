import React, { Component } from "react";
import "./Header.css";

class Header extends Component {
  render() {
    
    return (
      <div data-testid="Header-h1-headerContent" className="position">
        <div className="header">
          <div className="title">BOOKING SYSTEM</div>
        </div>
      </div>
    );
  }
}

export default Header;

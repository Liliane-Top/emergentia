import "./NavBar.css";

const NavBar = () => {
    return (
        <div>
            <nav className="navbar fixed-top">
                <a className="navbar-brand" href="/">
                    <img src="../../../public/img/logo192.png" width="50" height="50" alt="logo"/>
                </a>
                <button className="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#collapsingNavbar1">
                </button>
                <div className="navbar-collapse collapse" id="collapsingNavbar1">
                    <ul className="nav navbar-nav">
                        <li className="nav-item">
                            <a className="nav-link" href="/blog">Blog</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="/about">About</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="/contact">Contact</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    )
}

export default NavBar;